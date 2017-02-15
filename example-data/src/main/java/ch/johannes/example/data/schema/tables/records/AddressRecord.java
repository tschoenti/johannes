/**
 * This class is generated by jOOQ
 */
package ch.johannes.example.data.schema.tables.records;


import ch.johannes.example.data.schema.tables.Address;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class AddressRecord extends UpdatableRecordImpl<AddressRecord> implements Record5<Integer, Integer, String, Integer, String> {

	private static final long serialVersionUID = 1015671091;

	/**
	 * Setter for <code>public.address.id</code>.
	 */
	public AddressRecord setId(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.address.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.address.person_id</code>.
	 */
	public AddressRecord setPersonId(Integer value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.address.person_id</code>.
	 */
	public Integer getPersonId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.address.street</code>.
	 */
	public AddressRecord setStreet(String value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.address.street</code>.
	 */
	public String getStreet() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.address.zip_code</code>.
	 */
	public AddressRecord setZipCode(Integer value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>public.address.zip_code</code>.
	 */
	public Integer getZipCode() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>public.address.city</code>.
	 */
	public AddressRecord setCity(String value) {
		setValue(4, value);
		return this;
	}

	/**
	 * Getter for <code>public.address.city</code>.
	 */
	public String getCity() {
		return (String) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, Integer, String, Integer, String> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, Integer, String, Integer, String> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return Address.ADDRESS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return Address.ADDRESS.PERSON_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return Address.ADDRESS.STREET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return Address.ADDRESS.ZIP_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return Address.ADDRESS.CITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getPersonId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getStreet();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getZipCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getCity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord value2(Integer value) {
		setPersonId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord value3(String value) {
		setStreet(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord value4(Integer value) {
		setZipCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord value5(String value) {
		setCity(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AddressRecord values(Integer value1, Integer value2, String value3, Integer value4, String value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AddressRecord
	 */
	public AddressRecord() {
		super(Address.ADDRESS);
	}

	/**
	 * Create a detached, initialised AddressRecord
	 */
	public AddressRecord(Integer id, Integer personId, String street, Integer zipCode, String city) {
		super(Address.ADDRESS);

		setValue(0, id);
		setValue(1, personId);
		setValue(2, street);
		setValue(3, zipCode);
		setValue(4, city);
	}
}
