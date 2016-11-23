/**
 * This class is generated by jOOQ
 */
package IDM.JOOQ.generated.tables.records;


import IDM.JOOQ.generated.tables.Dept;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DeptRecord extends TableRecordImpl<DeptRecord> implements Record3<Byte, String, String> {

    private static final long serialVersionUID = -1054506990;

    /**
     * Setter for <code>library.dept.deptno</code>.
     */
    public void setDeptno(Byte value) {
        set(0, value);
    }

    /**
     * Getter for <code>library.dept.deptno</code>.
     */
    public Byte getDeptno() {
        return (Byte) get(0);
    }

    /**
     * Setter for <code>library.dept.dname</code>.
     */
    public void setDname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>library.dept.dname</code>.
     */
    public String getDname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>library.dept.loc</code>.
     */
    public void setLoc(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>library.dept.loc</code>.
     */
    public String getLoc() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Byte, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Byte, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field1() {
        return Dept.DEPT.DEPTNO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Dept.DEPT.DNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Dept.DEPT.LOC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value1() {
        return getDeptno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getDname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLoc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeptRecord value1(Byte value) {
        setDeptno(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeptRecord value2(String value) {
        setDname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeptRecord value3(String value) {
        setLoc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeptRecord values(Byte value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DeptRecord
     */
    public DeptRecord() {
        super(Dept.DEPT);
    }

    /**
     * Create a detached, initialised DeptRecord
     */
    public DeptRecord(Byte deptno, String dname, String loc) {
        super(Dept.DEPT);

        set(0, deptno);
        set(1, dname);
        set(2, loc);
    }
}