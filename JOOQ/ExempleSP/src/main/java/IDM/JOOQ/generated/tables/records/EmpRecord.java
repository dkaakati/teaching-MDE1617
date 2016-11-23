/**
 * This class is generated by jOOQ
 */
package IDM.JOOQ.generated.tables.records;


import IDM.JOOQ.generated.tables.Emp;

import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class EmpRecord extends TableRecordImpl<EmpRecord> implements Record8<Short, String, String, Short, Date, BigDecimal, BigDecimal, Byte> {

    private static final long serialVersionUID = -169499546;

    /**
     * Setter for <code>library.emp.empno</code>.
     */
    public void setEmpno(Short value) {
        set(0, value);
    }

    /**
     * Getter for <code>library.emp.empno</code>.
     */
    public Short getEmpno() {
        return (Short) get(0);
    }

    /**
     * Setter for <code>library.emp.ename</code>.
     */
    public void setEname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>library.emp.ename</code>.
     */
    public String getEname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>library.emp.job</code>.
     */
    public void setJob(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>library.emp.job</code>.
     */
    public String getJob() {
        return (String) get(2);
    }

    /**
     * Setter for <code>library.emp.mgr</code>.
     */
    public void setMgr(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>library.emp.mgr</code>.
     */
    public Short getMgr() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>library.emp.hiredate</code>.
     */
    public void setHiredate(Date value) {
        set(4, value);
    }

    /**
     * Getter for <code>library.emp.hiredate</code>.
     */
    public Date getHiredate() {
        return (Date) get(4);
    }

    /**
     * Setter for <code>library.emp.sal</code>.
     */
    public void setSal(BigDecimal value) {
        set(5, value);
    }

    /**
     * Getter for <code>library.emp.sal</code>.
     */
    public BigDecimal getSal() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>library.emp.comm</code>.
     */
    public void setComm(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>library.emp.comm</code>.
     */
    public BigDecimal getComm() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>library.emp.deptno</code>.
     */
    public void setDeptno(Byte value) {
        set(7, value);
    }

    /**
     * Getter for <code>library.emp.deptno</code>.
     */
    public Byte getDeptno() {
        return (Byte) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Short, String, String, Short, Date, BigDecimal, BigDecimal, Byte> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Short, String, String, Short, Date, BigDecimal, BigDecimal, Byte> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field1() {
        return Emp.EMP.EMPNO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Emp.EMP.ENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Emp.EMP.JOB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return Emp.EMP.MGR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field5() {
        return Emp.EMP.HIREDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return Emp.EMP.SAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return Emp.EMP.COMM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field8() {
        return Emp.EMP.DEPTNO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value1() {
        return getEmpno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getJob();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getMgr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value5() {
        return getHiredate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getSal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getComm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value8() {
        return getDeptno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmpRecord value1(Short value) {
        setEmpno(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmpRecord value2(String value) {
        setEname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmpRecord value3(String value) {
        setJob(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmpRecord value4(Short value) {
        setMgr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmpRecord value5(Date value) {
        setHiredate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmpRecord value6(BigDecimal value) {
        setSal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmpRecord value7(BigDecimal value) {
        setComm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmpRecord value8(Byte value) {
        setDeptno(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmpRecord values(Short value1, String value2, String value3, Short value4, Date value5, BigDecimal value6, BigDecimal value7, Byte value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmpRecord
     */
    public EmpRecord() {
        super(Emp.EMP);
    }

    /**
     * Create a detached, initialised EmpRecord
     */
    public EmpRecord(Short empno, String ename, String job, Short mgr, Date hiredate, BigDecimal sal, BigDecimal comm, Byte deptno) {
        super(Emp.EMP);

        set(0, empno);
        set(1, ename);
        set(2, job);
        set(3, mgr);
        set(4, hiredate);
        set(5, sal);
        set(6, comm);
        set(7, deptno);
    }
}