package xp.us.pojo;

import java.util.ArrayList;
import java.util.List;

public class WorkTextExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkTextExample() {
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

        public Criteria andTextidIsNull() {
            addCriterion("textid is null");
            return (Criteria) this;
        }

        public Criteria andTextidIsNotNull() {
            addCriterion("textid is not null");
            return (Criteria) this;
        }

        public Criteria andTextidEqualTo(Integer value) {
            addCriterion("textid =", value, "textid");
            return (Criteria) this;
        }

        public Criteria andTextidNotEqualTo(Integer value) {
            addCriterion("textid <>", value, "textid");
            return (Criteria) this;
        }

        public Criteria andTextidGreaterThan(Integer value) {
            addCriterion("textid >", value, "textid");
            return (Criteria) this;
        }

        public Criteria andTextidGreaterThanOrEqualTo(Integer value) {
            addCriterion("textid >=", value, "textid");
            return (Criteria) this;
        }

        public Criteria andTextidLessThan(Integer value) {
            addCriterion("textid <", value, "textid");
            return (Criteria) this;
        }

        public Criteria andTextidLessThanOrEqualTo(Integer value) {
            addCriterion("textid <=", value, "textid");
            return (Criteria) this;
        }

        public Criteria andTextidIn(List<Integer> values) {
            addCriterion("textid in", values, "textid");
            return (Criteria) this;
        }

        public Criteria andTextidNotIn(List<Integer> values) {
            addCriterion("textid not in", values, "textid");
            return (Criteria) this;
        }

        public Criteria andTextidBetween(Integer value1, Integer value2) {
            addCriterion("textid between", value1, value2, "textid");
            return (Criteria) this;
        }

        public Criteria andTextidNotBetween(Integer value1, Integer value2) {
            addCriterion("textid not between", value1, value2, "textid");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNull() {
            addCriterion("workid is null");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNotNull() {
            addCriterion("workid is not null");
            return (Criteria) this;
        }

        public Criteria andWorkidEqualTo(Integer value) {
            addCriterion("workid =", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotEqualTo(Integer value) {
            addCriterion("workid <>", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThan(Integer value) {
            addCriterion("workid >", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("workid >=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThan(Integer value) {
            addCriterion("workid <", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThanOrEqualTo(Integer value) {
            addCriterion("workid <=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidIn(List<Integer> values) {
            addCriterion("workid in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotIn(List<Integer> values) {
            addCriterion("workid not in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidBetween(Integer value1, Integer value2) {
            addCriterion("workid between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotBetween(Integer value1, Integer value2) {
            addCriterion("workid not between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andTextnameIsNull() {
            addCriterion("textname is null");
            return (Criteria) this;
        }

        public Criteria andTextnameIsNotNull() {
            addCriterion("textname is not null");
            return (Criteria) this;
        }

        public Criteria andTextnameEqualTo(String value) {
            addCriterion("textname =", value, "textname");
            return (Criteria) this;
        }

        public Criteria andTextnameNotEqualTo(String value) {
            addCriterion("textname <>", value, "textname");
            return (Criteria) this;
        }

        public Criteria andTextnameGreaterThan(String value) {
            addCriterion("textname >", value, "textname");
            return (Criteria) this;
        }

        public Criteria andTextnameGreaterThanOrEqualTo(String value) {
            addCriterion("textname >=", value, "textname");
            return (Criteria) this;
        }

        public Criteria andTextnameLessThan(String value) {
            addCriterion("textname <", value, "textname");
            return (Criteria) this;
        }

        public Criteria andTextnameLessThanOrEqualTo(String value) {
            addCriterion("textname <=", value, "textname");
            return (Criteria) this;
        }

        public Criteria andTextnameLike(String value) {
            addCriterion("textname like", value, "textname");
            return (Criteria) this;
        }

        public Criteria andTextnameNotLike(String value) {
            addCriterion("textname not like", value, "textname");
            return (Criteria) this;
        }

        public Criteria andTextnameIn(List<String> values) {
            addCriterion("textname in", values, "textname");
            return (Criteria) this;
        }

        public Criteria andTextnameNotIn(List<String> values) {
            addCriterion("textname not in", values, "textname");
            return (Criteria) this;
        }

        public Criteria andTextnameBetween(String value1, String value2) {
            addCriterion("textname between", value1, value2, "textname");
            return (Criteria) this;
        }

        public Criteria andTextnameNotBetween(String value1, String value2) {
            addCriterion("textname not between", value1, value2, "textname");
            return (Criteria) this;
        }

        public Criteria andImageIsNull() {
            addCriterion("image is null");
            return (Criteria) this;
        }

        public Criteria andImageIsNotNull() {
            addCriterion("image is not null");
            return (Criteria) this;
        }

        public Criteria andImageEqualTo(String value) {
            addCriterion("image =", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotEqualTo(String value) {
            addCriterion("image <>", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThan(String value) {
            addCriterion("image >", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageGreaterThanOrEqualTo(String value) {
            addCriterion("image >=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThan(String value) {
            addCriterion("image <", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLessThanOrEqualTo(String value) {
            addCriterion("image <=", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageLike(String value) {
            addCriterion("image like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotLike(String value) {
            addCriterion("image not like", value, "image");
            return (Criteria) this;
        }

        public Criteria andImageIn(List<String> values) {
            addCriterion("image in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotIn(List<String> values) {
            addCriterion("image not in", values, "image");
            return (Criteria) this;
        }

        public Criteria andImageBetween(String value1, String value2) {
            addCriterion("image between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andImageNotBetween(String value1, String value2) {
            addCriterion("image not between", value1, value2, "image");
            return (Criteria) this;
        }

        public Criteria andDiecIsNull() {
            addCriterion("diec is null");
            return (Criteria) this;
        }

        public Criteria andDiecIsNotNull() {
            addCriterion("diec is not null");
            return (Criteria) this;
        }

        public Criteria andDiecEqualTo(String value) {
            addCriterion("diec =", value, "diec");
            return (Criteria) this;
        }

        public Criteria andDiecNotEqualTo(String value) {
            addCriterion("diec <>", value, "diec");
            return (Criteria) this;
        }

        public Criteria andDiecGreaterThan(String value) {
            addCriterion("diec >", value, "diec");
            return (Criteria) this;
        }

        public Criteria andDiecGreaterThanOrEqualTo(String value) {
            addCriterion("diec >=", value, "diec");
            return (Criteria) this;
        }

        public Criteria andDiecLessThan(String value) {
            addCriterion("diec <", value, "diec");
            return (Criteria) this;
        }

        public Criteria andDiecLessThanOrEqualTo(String value) {
            addCriterion("diec <=", value, "diec");
            return (Criteria) this;
        }

        public Criteria andDiecLike(String value) {
            addCriterion("diec like", value, "diec");
            return (Criteria) this;
        }

        public Criteria andDiecNotLike(String value) {
            addCriterion("diec not like", value, "diec");
            return (Criteria) this;
        }

        public Criteria andDiecIn(List<String> values) {
            addCriterion("diec in", values, "diec");
            return (Criteria) this;
        }

        public Criteria andDiecNotIn(List<String> values) {
            addCriterion("diec not in", values, "diec");
            return (Criteria) this;
        }

        public Criteria andDiecBetween(String value1, String value2) {
            addCriterion("diec between", value1, value2, "diec");
            return (Criteria) this;
        }

        public Criteria andDiecNotBetween(String value1, String value2) {
            addCriterion("diec not between", value1, value2, "diec");
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