/**
 * This class is generated by jOOQ
 */
package ch.johannes.example.data.schema;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in public
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

	/**
	 * The sequence <code>public.address_sequence</code>
	 */
	public static final Sequence<Long> ADDRESS_SEQUENCE = new SequenceImpl<Long>("address_sequence", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.person_sequence</code>
	 */
	public static final Sequence<Long> PERSON_SEQUENCE = new SequenceImpl<Long>("person_sequence", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
