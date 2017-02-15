/**
 * This class is generated by jOOQ
 */
package ch.johannes.example.data.schema.tables.records;


import ch.johannes.example.data.schema.tables.PersonAndAddressView;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


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
public class PersonAndAddressViewRecord extends TableRecordImpl<PersonAndAddressViewRecord> implements Record7<Integer, String, String, Integer, String, Integer, String> {

	private static final long serialVersionUID = -1684419958;

	/**
	 * Setter for <code>public.person_and_address_view.person_id</code>.
	 */
	public PersonAndAddressViewRecord setPersonId(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.person_and_address_view.person_id</code>.
	 */
	public Integer getPersonId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.person_and_address_view.firstname</code>.
	 */
	public PersonAndAddressViewRecord setFirstname(String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.person_and_address_view.firstname</code>.
	 */
	public String getFirstname() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>public.person_and_address_view.lastname</code>.
	 */
	public PersonAndAddressViewRecord setLastname(String value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.person_and_address_view.lastname</code>.
	 */
	public String getLastname() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>public.person_and_address_view.address_id</code>.
	 */
	public PersonAndAddressViewRecord setAddressId(Integer value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>public.person_and_address_view.address_id</code>.
	 */
	public Integer getAddressId() {
		return (Integer) getValue(3);
	}

	/**
	 * Setter for <code>public.person_and_address_view.street</code>.
	 */
	public PersonAndAddressViewRecord setStreet(String value) {
		setValue(4, value);
		return this;
	}

	/**
	 * Getter for <code>public.person_and_address_view.street</code>.
	 */
	public String getStreet() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>public.person_and_address_view.zip_code</code>.
	 */
	public PersonAndAddressViewRecord setZipCode(Integer value) {
		setValue(5, value);
		return this;
	}

	/**
	 * Getter for <code>public.person_and_address_view.zip_code</code>.
	 */
	public Integer getZipCode() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>public.person_and_address_view.city</code>.
	 */
	public PersonAndAddressViewRecord setCity(String value) {
		setValue(6, value);
		return this;
	}

	/**
	 * Getter for <code>public.person_and_address_view.city</code>.
	 */
	public String getCity() {
		return (String) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Integer, String, String, Integer, String, Integer, String> fieldsRow() {
		return (Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row7<Integer, String, String, Integer, String, Integer, String> valuesRow() {
		return (Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return PersonAndAddressView.PERSON_AND_ADDRESS_VIEW.PERSON_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return PersonAndAddressView.PERSON_AND_ADDRESS_VIEW.FIRSTNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return PersonAndAddressView.PERSON_AND_ADDRESS_VIEW.LASTNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field4() {
		return PersonAndAddressView.PERSON_AND_ADDRESS_VIEW.ADDRESS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return PersonAndAddressView.PERSON_AND_ADDRESS_VIEW.STREET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return PersonAndAddressView.PERSON_AND_ADDRESS_VIEW.ZIP_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return PersonAndAddressView.PERSON_AND_ADDRESS_VIEW.CITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getPersonId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getFirstname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getLastname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value4() {
		return getAddressId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getStreet();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getZipCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getCity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PersonAndAddressViewRecord value1(Integer value) {
		setPersonId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PersonAndAddressViewRecord value2(String value) {
		setFirstname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PersonAndAddressViewRecord value3(String value) {
		setLastname(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PersonAndAddressViewRecord value4(Integer value) {
		setAddressId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PersonAndAddressViewRecord value5(String value) {
		setStreet(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PersonAndAddressViewRecord value6(Integer value) {
		setZipCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PersonAndAddressViewRecord value7(String value) {
		setCity(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PersonAndAddressViewRecord values(Integer value1, String value2, String value3, Integer value4, String value5, Integer value6, String value7) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PersonAndAddressViewRecord
	 */
	public PersonAndAddressViewRecord() {
		super(PersonAndAddressView.PERSON_AND_ADDRESS_VIEW);
	}

	/**
	 * Create a detached, initialised PersonAndAddressViewRecord
	 */
	public PersonAndAddressViewRecord(Integer personId, String firstname, String lastname, Integer addressId, String street, Integer zipCode, String city) {
		super(PersonAndAddressView.PERSON_AND_ADDRESS_VIEW);

		setValue(0, personId);
		setValue(1, firstname);
		setValue(2, lastname);
		setValue(3, addressId);
		setValue(4, street);
		setValue(5, zipCode);
		setValue(6, city);
	}
}
