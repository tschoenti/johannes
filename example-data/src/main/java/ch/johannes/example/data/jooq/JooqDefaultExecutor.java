package ch.johannes.example.data.jooq;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.exception.DataAccessException;
import org.jooq.impl.DSL;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


public class JooqDefaultExecutor implements JooqExecutor{

    private final SQLDialect sqlDialect;

    private final DataSource dataSource;

    public JooqDefaultExecutor(SQLDialect sqlDialect, DataSource dataSource) {
        this.sqlDialect = sqlDialect;
        this.dataSource = dataSource;
    }

    public <T> T execute(JOOQCallback<T> callback) {
        final Connection connection = DatabaseUtil.createConnection(dataSource);
        try {
            return execute(callback, connection);
        } catch (Exception e) {
            throw new RepositoryException(e.getMessage(), e);
        } finally {
            DatabaseUtil.close(connection);
        }
    }

    public <T> T execute(JOOQCallback<T> callback, Connection connection) throws SQLException {
        try (DSLContext dslContext = DSL.using(connection, sqlDialect)) {
            return callback.execute(dslContext);
        } catch (DataAccessException e) {
            throw new RepositoryException(e.getMessage(), unwrapRootCause(e));
        }
    }

    public void executeWithoutResult(JOOQVoidCallback callback) {
        final Connection connection = DatabaseUtil.createConnection(dataSource);
        try {
            executeWithoutResult(callback, connection);
        } catch (Exception e) {
            throw new RepositoryException(e.getMessage(), e);
        } finally {
            DatabaseUtil.close(connection);
        }
    }

    public void executeWithoutResult(JOOQVoidCallback callback, Connection connection) throws SQLException {
        try (DSLContext dslContext = DSL.using(connection, sqlDialect)) {
            callback.execute(dslContext);
        } catch (DataAccessException e) {
            throw new RepositoryException(e.getMessage(), unwrapRootCause(e));
        }
    }

    private Exception unwrapRootCause(Exception e) {
        if (e.getCause() instanceof SQLException && ((SQLException) e.getCause()).getNextException() != null) {
            return ((SQLException) e.getCause()).getNextException();
        }
        return e;
    }

}
