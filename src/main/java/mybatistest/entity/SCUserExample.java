package mybatistest.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SCUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SCUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUserIDIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUserIDIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIDEqualTo(String value) {
            addCriterion("USERID =", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotEqualTo(String value) {
            addCriterion("USERID <>", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThan(String value) {
            addCriterion("USERID >", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDGreaterThanOrEqualTo(String value) {
            addCriterion("USERID >=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThan(String value) {
            addCriterion("USERID <", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLessThanOrEqualTo(String value) {
            addCriterion("USERID <=", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDLike(String value) {
            addCriterion("USERID like", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotLike(String value) {
            addCriterion("USERID not like", value, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDIn(List<String> values) {
            addCriterion("USERID in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotIn(List<String> values) {
            addCriterion("USERID not in", values, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDBetween(String value1, String value2) {
            addCriterion("USERID between", value1, value2, "userID");
            return (Criteria) this;
        }

        public Criteria andUserIDNotBetween(String value1, String value2) {
            addCriterion("USERID not between", value1, value2, "userID");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("ORDERNO is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("ORDERNO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(int value) {
            addCriterion("ORDERNO =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(int value) {
            addCriterion("ORDERNO <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(int value) {
            addCriterion("ORDERNO >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(int value) {
            addCriterion("ORDERNO >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(int value) {
            addCriterion("ORDERNO <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(int value) {
            addCriterion("ORDERNO <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<Integer> values) {
            addCriterion("ORDERNO in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<Integer> values) {
            addCriterion("ORDERNO not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(int value1, int value2) {
            addCriterion("ORDERNO between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(int value1, int value2) {
            addCriterion("ORDERNO not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andUsernoIsNull() {
            addCriterion("USERNO is null");
            return (Criteria) this;
        }

        public Criteria andUsernoIsNotNull() {
            addCriterion("USERNO is not null");
            return (Criteria) this;
        }

        public Criteria andUsernoEqualTo(String value) {
            addCriterion("USERNO =", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoNotEqualTo(String value) {
            addCriterion("USERNO <>", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoGreaterThan(String value) {
            addCriterion("USERNO >", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoGreaterThanOrEqualTo(String value) {
            addCriterion("USERNO >=", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoLessThan(String value) {
            addCriterion("USERNO <", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoLessThanOrEqualTo(String value) {
            addCriterion("USERNO <=", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoLike(String value) {
            addCriterion("USERNO like", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoNotLike(String value) {
            addCriterion("USERNO not like", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoIn(List<String> values) {
            addCriterion("USERNO in", values, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoNotIn(List<String> values) {
            addCriterion("USERNO not in", values, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoBetween(String value1, String value2) {
            addCriterion("USERNO between", value1, value2, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoNotBetween(String value1, String value2) {
            addCriterion("USERNO not between", value1, value2, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNull() {
            addCriterion("DEPARTMENTID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("DEPARTMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(String value) {
            addCriterion("DEPARTMENTID =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(String value) {
            addCriterion("DEPARTMENTID <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(String value) {
            addCriterion("DEPARTMENTID >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTID >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(String value) {
            addCriterion("DEPARTMENTID <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENTID <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLike(String value) {
            addCriterion("DEPARTMENTID like", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotLike(String value) {
            addCriterion("DEPARTMENTID not like", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<String> values) {
            addCriterion("DEPARTMENTID in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<String> values) {
            addCriterion("DEPARTMENTID not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(String value1, String value2) {
            addCriterion("DEPARTMENTID between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENTID not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNull() {
            addCriterion("EMPLOYEEID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIsNotNull() {
            addCriterion("EMPLOYEEID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeidEqualTo(String value) {
            addCriterion("EMPLOYEEID =", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotEqualTo(String value) {
            addCriterion("EMPLOYEEID <>", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThan(String value) {
            addCriterion("EMPLOYEEID >", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEEID >=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThan(String value) {
            addCriterion("EMPLOYEEID <", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEEID <=", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidLike(String value) {
            addCriterion("EMPLOYEEID like", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotLike(String value) {
            addCriterion("EMPLOYEEID not like", value, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidIn(List<String> values) {
            addCriterion("EMPLOYEEID in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotIn(List<String> values) {
            addCriterion("EMPLOYEEID not in", values, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidBetween(String value1, String value2) {
            addCriterion("EMPLOYEEID between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andEmployeeidNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEEID not between", value1, value2, "employeeid");
            return (Criteria) this;
        }

        public Criteria andPartneridIsNull() {
            addCriterion("PARTNERID is null");
            return (Criteria) this;
        }

        public Criteria andPartneridIsNotNull() {
            addCriterion("PARTNERID is not null");
            return (Criteria) this;
        }

        public Criteria andPartneridEqualTo(String value) {
            addCriterion("PARTNERID =", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridNotEqualTo(String value) {
            addCriterion("PARTNERID <>", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridGreaterThan(String value) {
            addCriterion("PARTNERID >", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridGreaterThanOrEqualTo(String value) {
            addCriterion("PARTNERID >=", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridLessThan(String value) {
            addCriterion("PARTNERID <", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridLessThanOrEqualTo(String value) {
            addCriterion("PARTNERID <=", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridLike(String value) {
            addCriterion("PARTNERID like", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridNotLike(String value) {
            addCriterion("PARTNERID not like", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridIn(List<String> values) {
            addCriterion("PARTNERID in", values, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridNotIn(List<String> values) {
            addCriterion("PARTNERID not in", values, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridBetween(String value1, String value2) {
            addCriterion("PARTNERID between", value1, value2, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridNotBetween(String value1, String value2) {
            addCriterion("PARTNERID not between", value1, value2, "partnerid");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIsNull() {
            addCriterion("MOBILENUMBER is null");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIsNotNull() {
            addCriterion("MOBILENUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andMobilenumberEqualTo(String value) {
            addCriterion("MOBILENUMBER =", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotEqualTo(String value) {
            addCriterion("MOBILENUMBER <>", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberGreaterThan(String value) {
            addCriterion("MOBILENUMBER >", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILENUMBER >=", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLessThan(String value) {
            addCriterion("MOBILENUMBER <", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLessThanOrEqualTo(String value) {
            addCriterion("MOBILENUMBER <=", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberLike(String value) {
            addCriterion("MOBILENUMBER like", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotLike(String value) {
            addCriterion("MOBILENUMBER not like", value, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberIn(List<String> values) {
            addCriterion("MOBILENUMBER in", values, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotIn(List<String> values) {
            addCriterion("MOBILENUMBER not in", values, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberBetween(String value1, String value2) {
            addCriterion("MOBILENUMBER between", value1, value2, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andMobilenumberNotBetween(String value1, String value2) {
            addCriterion("MOBILENUMBER not between", value1, value2, "mobilenumber");
            return (Criteria) this;
        }

        public Criteria andEmailaddressIsNull() {
            addCriterion("EMAILADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andEmailaddressIsNotNull() {
            addCriterion("EMAILADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andEmailaddressEqualTo(String value) {
            addCriterion("EMAILADDRESS =", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressNotEqualTo(String value) {
            addCriterion("EMAILADDRESS <>", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressGreaterThan(String value) {
            addCriterion("EMAILADDRESS >", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressGreaterThanOrEqualTo(String value) {
            addCriterion("EMAILADDRESS >=", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressLessThan(String value) {
            addCriterion("EMAILADDRESS <", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressLessThanOrEqualTo(String value) {
            addCriterion("EMAILADDRESS <=", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressLike(String value) {
            addCriterion("EMAILADDRESS like", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressNotLike(String value) {
            addCriterion("EMAILADDRESS not like", value, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressIn(List<String> values) {
            addCriterion("EMAILADDRESS in", values, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressNotIn(List<String> values) {
            addCriterion("EMAILADDRESS not in", values, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressBetween(String value1, String value2) {
            addCriterion("EMAILADDRESS between", value1, value2, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andEmailaddressNotBetween(String value1, String value2) {
            addCriterion("EMAILADDRESS not between", value1, value2, "emailaddress");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andLockedIsNull() {
            addCriterion("LOCKED is null");
            return (Criteria) this;
        }

        public Criteria andLockedIsNotNull() {
            addCriterion("LOCKED is not null");
            return (Criteria) this;
        }

        public Criteria andLockedEqualTo(String value) {
            addCriterion("LOCKED =", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotEqualTo(String value) {
            addCriterion("LOCKED <>", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThan(String value) {
            addCriterion("LOCKED >", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThanOrEqualTo(String value) {
            addCriterion("LOCKED >=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThan(String value) {
            addCriterion("LOCKED <", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThanOrEqualTo(String value) {
            addCriterion("LOCKED <=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLike(String value) {
            addCriterion("LOCKED like", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotLike(String value) {
            addCriterion("LOCKED not like", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedIn(List<String> values) {
            addCriterion("LOCKED in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotIn(List<String> values) {
            addCriterion("LOCKED not in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedBetween(String value1, String value2) {
            addCriterion("LOCKED between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotBetween(String value1, String value2) {
            addCriterion("LOCKED not between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLastloginIsNull() {
            addCriterion("LASTLOGIN is null");
            return (Criteria) this;
        }

        public Criteria andLastloginIsNotNull() {
            addCriterion("LASTLOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andLastloginEqualTo(Date value) {
            addCriterionForJDBCDate("LASTLOGIN =", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotEqualTo(Date value) {
            addCriterionForJDBCDate("LASTLOGIN <>", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginGreaterThan(Date value) {
            addCriterionForJDBCDate("LASTLOGIN >", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LASTLOGIN >=", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginLessThan(Date value) {
            addCriterionForJDBCDate("LASTLOGIN <", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LASTLOGIN <=", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginIn(List<Date> values) {
            addCriterionForJDBCDate("LASTLOGIN in", values, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotIn(List<Date> values) {
            addCriterionForJDBCDate("LASTLOGIN not in", values, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LASTLOGIN between", value1, value2, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LASTLOGIN not between", value1, value2, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastpwdsetIsNull() {
            addCriterion("LASTPWDSET is null");
            return (Criteria) this;
        }

        public Criteria andLastpwdsetIsNotNull() {
            addCriterion("LASTPWDSET is not null");
            return (Criteria) this;
        }

        public Criteria andLastpwdsetEqualTo(Date value) {
            addCriterionForJDBCDate("LASTPWDSET =", value, "lastpwdset");
            return (Criteria) this;
        }

        public Criteria andLastpwdsetNotEqualTo(Date value) {
            addCriterionForJDBCDate("LASTPWDSET <>", value, "lastpwdset");
            return (Criteria) this;
        }

        public Criteria andLastpwdsetGreaterThan(Date value) {
            addCriterionForJDBCDate("LASTPWDSET >", value, "lastpwdset");
            return (Criteria) this;
        }

        public Criteria andLastpwdsetGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LASTPWDSET >=", value, "lastpwdset");
            return (Criteria) this;
        }

        public Criteria andLastpwdsetLessThan(Date value) {
            addCriterionForJDBCDate("LASTPWDSET <", value, "lastpwdset");
            return (Criteria) this;
        }

        public Criteria andLastpwdsetLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("LASTPWDSET <=", value, "lastpwdset");
            return (Criteria) this;
        }

        public Criteria andLastpwdsetIn(List<Date> values) {
            addCriterionForJDBCDate("LASTPWDSET in", values, "lastpwdset");
            return (Criteria) this;
        }

        public Criteria andLastpwdsetNotIn(List<Date> values) {
            addCriterionForJDBCDate("LASTPWDSET not in", values, "lastpwdset");
            return (Criteria) this;
        }

        public Criteria andLastpwdsetBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LASTPWDSET between", value1, value2, "lastpwdset");
            return (Criteria) this;
        }

        public Criteria andLastpwdsetNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("LASTPWDSET not between", value1, value2, "lastpwdset");
            return (Criteria) this;
        }

        public Criteria andPwdexdateIsNull() {
            addCriterion("PWDEXDATE is null");
            return (Criteria) this;
        }

        public Criteria andPwdexdateIsNotNull() {
            addCriterion("PWDEXDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPwdexdateEqualTo(Date value) {
            addCriterionForJDBCDate("PWDEXDATE =", value, "pwdexdate");
            return (Criteria) this;
        }

        public Criteria andPwdexdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PWDEXDATE <>", value, "pwdexdate");
            return (Criteria) this;
        }

        public Criteria andPwdexdateGreaterThan(Date value) {
            addCriterionForJDBCDate("PWDEXDATE >", value, "pwdexdate");
            return (Criteria) this;
        }

        public Criteria andPwdexdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PWDEXDATE >=", value, "pwdexdate");
            return (Criteria) this;
        }

        public Criteria andPwdexdateLessThan(Date value) {
            addCriterionForJDBCDate("PWDEXDATE <", value, "pwdexdate");
            return (Criteria) this;
        }

        public Criteria andPwdexdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PWDEXDATE <=", value, "pwdexdate");
            return (Criteria) this;
        }

        public Criteria andPwdexdateIn(List<Date> values) {
            addCriterionForJDBCDate("PWDEXDATE in", values, "pwdexdate");
            return (Criteria) this;
        }

        public Criteria andPwdexdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PWDEXDATE not in", values, "pwdexdate");
            return (Criteria) this;
        }

        public Criteria andPwdexdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PWDEXDATE between", value1, value2, "pwdexdate");
            return (Criteria) this;
        }

        public Criteria andPwdexdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PWDEXDATE not between", value1, value2, "pwdexdate");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNull() {
            addCriterion("CREATEUSERID is null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNotNull() {
            addCriterion("CREATEUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridEqualTo(String value) {
            addCriterion("CREATEUSERID =", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotEqualTo(String value) {
            addCriterion("CREATEUSERID <>", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThan(String value) {
            addCriterion("CREATEUSERID >", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEUSERID >=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThan(String value) {
            addCriterion("CREATEUSERID <", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThanOrEqualTo(String value) {
            addCriterion("CREATEUSERID <=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLike(String value) {
            addCriterion("CREATEUSERID like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotLike(String value) {
            addCriterion("CREATEUSERID not like", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIn(List<String> values) {
            addCriterion("CREATEUSERID in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotIn(List<String> values) {
            addCriterion("CREATEUSERID not in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridBetween(String value1, String value2) {
            addCriterion("CREATEUSERID between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotBetween(String value1, String value2) {
            addCriterion("CREATEUSERID not between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDATE =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDATE <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATEDATE >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDATE >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("CREATEDATE <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATEDATE <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("CREATEDATE in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATEDATE not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATEDATE between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATEDATE not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIsNull() {
            addCriterion("UPDATEUSERID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIsNotNull() {
            addCriterion("UPDATEUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridEqualTo(String value) {
            addCriterion("UPDATEUSERID =", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotEqualTo(String value) {
            addCriterion("UPDATEUSERID <>", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThan(String value) {
            addCriterion("UPDATEUSERID >", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEUSERID >=", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThan(String value) {
            addCriterion("UPDATEUSERID <", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThanOrEqualTo(String value) {
            addCriterion("UPDATEUSERID <=", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLike(String value) {
            addCriterion("UPDATEUSERID like", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotLike(String value) {
            addCriterion("UPDATEUSERID not like", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIn(List<String> values) {
            addCriterion("UPDATEUSERID in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotIn(List<String> values) {
            addCriterion("UPDATEUSERID not in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridBetween(String value1, String value2) {
            addCriterion("UPDATEUSERID between", value1, value2, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotBetween(String value1, String value2) {
            addCriterion("UPDATEUSERID not between", value1, value2, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("UPDATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("UPDATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATEDATE =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATEDATE <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("UPDATEDATE >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATEDATE >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterionForJDBCDate("UPDATEDATE <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("UPDATEDATE <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATEDATE in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("UPDATEDATE not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATEDATE between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("UPDATEDATE not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andOwneruseridIsNull() {
            addCriterion("OWNERUSERID is null");
            return (Criteria) this;
        }

        public Criteria andOwneruseridIsNotNull() {
            addCriterion("OWNERUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andOwneruseridEqualTo(String value) {
            addCriterion("OWNERUSERID =", value, "owneruserid");
            return (Criteria) this;
        }

        public Criteria andOwneruseridNotEqualTo(String value) {
            addCriterion("OWNERUSERID <>", value, "owneruserid");
            return (Criteria) this;
        }

        public Criteria andOwneruseridGreaterThan(String value) {
            addCriterion("OWNERUSERID >", value, "owneruserid");
            return (Criteria) this;
        }

        public Criteria andOwneruseridGreaterThanOrEqualTo(String value) {
            addCriterion("OWNERUSERID >=", value, "owneruserid");
            return (Criteria) this;
        }

        public Criteria andOwneruseridLessThan(String value) {
            addCriterion("OWNERUSERID <", value, "owneruserid");
            return (Criteria) this;
        }

        public Criteria andOwneruseridLessThanOrEqualTo(String value) {
            addCriterion("OWNERUSERID <=", value, "owneruserid");
            return (Criteria) this;
        }

        public Criteria andOwneruseridLike(String value) {
            addCriterion("OWNERUSERID like", value, "owneruserid");
            return (Criteria) this;
        }

        public Criteria andOwneruseridNotLike(String value) {
            addCriterion("OWNERUSERID not like", value, "owneruserid");
            return (Criteria) this;
        }

        public Criteria andOwneruseridIn(List<String> values) {
            addCriterion("OWNERUSERID in", values, "owneruserid");
            return (Criteria) this;
        }

        public Criteria andOwneruseridNotIn(List<String> values) {
            addCriterion("OWNERUSERID not in", values, "owneruserid");
            return (Criteria) this;
        }

        public Criteria andOwneruseridBetween(String value1, String value2) {
            addCriterion("OWNERUSERID between", value1, value2, "owneruserid");
            return (Criteria) this;
        }

        public Criteria andOwneruseridNotBetween(String value1, String value2) {
            addCriterion("OWNERUSERID not between", value1, value2, "owneruserid");
            return (Criteria) this;
        }

        public Criteria andOwnerdepartmentidIsNull() {
            addCriterion("OWNERDEPARTMENTID is null");
            return (Criteria) this;
        }

        public Criteria andOwnerdepartmentidIsNotNull() {
            addCriterion("OWNERDEPARTMENTID is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerdepartmentidEqualTo(String value) {
            addCriterion("OWNERDEPARTMENTID =", value, "ownerdepartmentid");
            return (Criteria) this;
        }

        public Criteria andOwnerdepartmentidNotEqualTo(String value) {
            addCriterion("OWNERDEPARTMENTID <>", value, "ownerdepartmentid");
            return (Criteria) this;
        }

        public Criteria andOwnerdepartmentidGreaterThan(String value) {
            addCriterion("OWNERDEPARTMENTID >", value, "ownerdepartmentid");
            return (Criteria) this;
        }

        public Criteria andOwnerdepartmentidGreaterThanOrEqualTo(String value) {
            addCriterion("OWNERDEPARTMENTID >=", value, "ownerdepartmentid");
            return (Criteria) this;
        }

        public Criteria andOwnerdepartmentidLessThan(String value) {
            addCriterion("OWNERDEPARTMENTID <", value, "ownerdepartmentid");
            return (Criteria) this;
        }

        public Criteria andOwnerdepartmentidLessThanOrEqualTo(String value) {
            addCriterion("OWNERDEPARTMENTID <=", value, "ownerdepartmentid");
            return (Criteria) this;
        }

        public Criteria andOwnerdepartmentidLike(String value) {
            addCriterion("OWNERDEPARTMENTID like", value, "ownerdepartmentid");
            return (Criteria) this;
        }

        public Criteria andOwnerdepartmentidNotLike(String value) {
            addCriterion("OWNERDEPARTMENTID not like", value, "ownerdepartmentid");
            return (Criteria) this;
        }

        public Criteria andOwnerdepartmentidIn(List<String> values) {
            addCriterion("OWNERDEPARTMENTID in", values, "ownerdepartmentid");
            return (Criteria) this;
        }

        public Criteria andOwnerdepartmentidNotIn(List<String> values) {
            addCriterion("OWNERDEPARTMENTID not in", values, "ownerdepartmentid");
            return (Criteria) this;
        }

        public Criteria andOwnerdepartmentidBetween(String value1, String value2) {
            addCriterion("OWNERDEPARTMENTID between", value1, value2, "ownerdepartmentid");
            return (Criteria) this;
        }

        public Criteria andOwnerdepartmentidNotBetween(String value1, String value2) {
            addCriterion("OWNERDEPARTMENTID not between", value1, value2, "ownerdepartmentid");
            return (Criteria) this;
        }

        public Criteria andImIsNull() {
            addCriterion("IM is null");
            return (Criteria) this;
        }

        public Criteria andImIsNotNull() {
            addCriterion("IM is not null");
            return (Criteria) this;
        }

        public Criteria andImEqualTo(String value) {
            addCriterion("IM =", value, "im");
            return (Criteria) this;
        }

        public Criteria andImNotEqualTo(String value) {
            addCriterion("IM <>", value, "im");
            return (Criteria) this;
        }

        public Criteria andImGreaterThan(String value) {
            addCriterion("IM >", value, "im");
            return (Criteria) this;
        }

        public Criteria andImGreaterThanOrEqualTo(String value) {
            addCriterion("IM >=", value, "im");
            return (Criteria) this;
        }

        public Criteria andImLessThan(String value) {
            addCriterion("IM <", value, "im");
            return (Criteria) this;
        }

        public Criteria andImLessThanOrEqualTo(String value) {
            addCriterion("IM <=", value, "im");
            return (Criteria) this;
        }

        public Criteria andImLike(String value) {
            addCriterion("IM like", value, "im");
            return (Criteria) this;
        }

        public Criteria andImNotLike(String value) {
            addCriterion("IM not like", value, "im");
            return (Criteria) this;
        }

        public Criteria andImIn(List<String> values) {
            addCriterion("IM in", values, "im");
            return (Criteria) this;
        }

        public Criteria andImNotIn(List<String> values) {
            addCriterion("IM not in", values, "im");
            return (Criteria) this;
        }

        public Criteria andImBetween(String value1, String value2) {
            addCriterion("IM between", value1, value2, "im");
            return (Criteria) this;
        }

        public Criteria andImNotBetween(String value1, String value2) {
            addCriterion("IM not between", value1, value2, "im");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}