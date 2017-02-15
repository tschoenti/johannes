/**
 * This class is generated by jOOQ
 */
package ch.johannes.example.data.schema.tables;


import ch.johannes.example.data.schema.Keys;
import ch.johannes.example.data.schema.Public;
import ch.johannes.example.data.schema.tables.records.GroupMembershipRecord;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GroupMembership extends TableImpl<GroupMembershipRecord> {

	private static final long serialVersionUID = -1087354514;

	/**
	 * The reference instance of <code>public.group_membership</code>
	 */
	public static final GroupMembership GROUP_MEMBERSHIP = new GroupMembership();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<GroupMembershipRecord> getRecordType() {
		return GroupMembershipRecord.class;
	}

	/**
	 * The column <code>public.group_membership.group_guid</code>.
	 */
	public final TableField<GroupMembershipRecord, UUID> GROUP_GUID = createField("group_guid", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

	/**
	 * The column <code>public.group_membership.member_guid</code>.
	 */
	public final TableField<GroupMembershipRecord, UUID> MEMBER_GUID = createField("member_guid", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

	/**
	 * The column <code>public.group_membership.access_level</code>.
	 */
	public final TableField<GroupMembershipRecord, Integer> ACCESS_LEVEL = createField("access_level", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>public.group_membership</code> table reference
	 */
	public GroupMembership() {
		this("group_membership", null);
	}

	/**
	 * Create an aliased <code>public.group_membership</code> table reference
	 */
	public GroupMembership(String alias) {
		this(alias, GROUP_MEMBERSHIP);
	}

	private GroupMembership(String alias, Table<GroupMembershipRecord> aliased) {
		this(alias, aliased, null);
	}

	private GroupMembership(String alias, Table<GroupMembershipRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<GroupMembershipRecord> getPrimaryKey() {
		return Keys.GROUP_MEMBERSHIP_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<GroupMembershipRecord>> getKeys() {
		return Arrays.<UniqueKey<GroupMembershipRecord>>asList(Keys.GROUP_MEMBERSHIP_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public GroupMembership as(String alias) {
		return new GroupMembership(alias, this);
	}

	/**
	 * Rename this table
	 */
	public GroupMembership rename(String name) {
		return new GroupMembership(name, null);
	}
}