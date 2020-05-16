/**
 */
package de.senacor.smt.model.smtmetamodel.tests;

import de.senacor.smt.model.smtmetamodel.Schluessel;
import de.senacor.smt.model.smtmetamodel.SmtmetamodelFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Schluessel</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchluesselTest extends TestCase {

	/**
	 * The fixture for this Schluessel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schluessel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SchluesselTest.class);
	}

	/**
	 * Constructs a new Schluessel test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchluesselTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Schluessel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Schluessel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Schluessel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Schluessel getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SmtmetamodelFactory.eINSTANCE.createSchluessel());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SchluesselTest
