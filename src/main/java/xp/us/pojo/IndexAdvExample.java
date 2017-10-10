package xp.us.pojo;

import java.util.ArrayList;
import java.util.List;

public class IndexAdvExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndexAdvExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andAdvnameIsNull() {
            addCriterion("advname is null");
            return (Criteria) this;
        }

        public Criteria andAdvnameIsNotNull() {
            addCriterion("advname is not null");
            return (Criteria) this;
        }

        public Criteria andAdvnameEqualTo(String value) {
            addCriterion("advname =", value, "advname");
            return (Criteria) this;
        }

        public Criteria andAdvnameNotEqualTo(String value) {
            addCriterion("advname <>", value, "advname");
            return (Criteria) this;
        }

        public Criteria andAdvnameGreaterThan(String value) {
            addCriterion("advname >", value, "advname");
            return (Criteria) this;
        }

        public Criteria andAdvnameGreaterThanOrEqualTo(String value) {
            addCriterion("advname >=", value, "advname");
            return (Criteria) this;
        }

        public Criteria andAdvnameLessThan(String value) {
            addCriterion("advname <", value, "advname");
            return (Criteria) this;
        }

        public Criteria andAdvnameLessThanOrEqualTo(String value) {
            addCriterion("advname <=", value, "advname");
            return (Criteria) this;
        }

        public Criteria andAdvnameLike(String value) {
            addCriterion("advname like", value, "advname");
            return (Criteria) this;
        }

        public Criteria andAdvnameNotLike(String value) {
            addCriterion("advname not like", value, "advname");
            return (Criteria) this;
        }

        public Criteria andAdvnameIn(List<String> values) {
            addCriterion("advname in", values, "advname");
            return (Criteria) this;
        }

        public Criteria andAdvnameNotIn(List<String> values) {
            addCriterion("advname not in", values, "advname");
            return (Criteria) this;
        }

        public Criteria andAdvnameBetween(String value1, String value2) {
            addCriterion("advname between", value1, value2, "advname");
            return (Criteria) this;
        }

        public Criteria andAdvnameNotBetween(String value1, String value2) {
            addCriterion("advname not between", value1, value2, "advname");
            return (Criteria) this;
        }

        public Criteria andAdvarticleIsNull() {
            addCriterion("advarticle is null");
            return (Criteria) this;
        }

        public Criteria andAdvarticleIsNotNull() {
            addCriterion("advarticle is not null");
            return (Criteria) this;
        }

        public Criteria andAdvarticleEqualTo(String value) {
            addCriterion("advarticle =", value, "advarticle");
            return (Criteria) this;
        }

        public Criteria andAdvarticleNotEqualTo(String value) {
            addCriterion("advarticle <>", value, "advarticle");
            return (Criteria) this;
        }

        public Criteria andAdvarticleGreaterThan(String value) {
            addCriterion("advarticle >", value, "advarticle");
            return (Criteria) this;
        }

        public Criteria andAdvarticleGreaterThanOrEqualTo(String value) {
            addCriterion("advarticle >=", value, "advarticle");
            return (Criteria) this;
        }

        public Criteria andAdvarticleLessThan(String value) {
            addCriterion("advarticle <", value, "advarticle");
            return (Criteria) this;
        }

        public Criteria andAdvarticleLessThanOrEqualTo(String value) {
            addCriterion("advarticle <=", value, "advarticle");
            return (Criteria) this;
        }

        public Criteria andAdvarticleLike(String value) {
            addCriterion("advarticle like", value, "advarticle");
            return (Criteria) this;
        }

        public Criteria andAdvarticleNotLike(String value) {
            addCriterion("advarticle not like", value, "advarticle");
            return (Criteria) this;
        }

        public Criteria andAdvarticleIn(List<String> values) {
            addCriterion("advarticle in", values, "advarticle");
            return (Criteria) this;
        }

        public Criteria andAdvarticleNotIn(List<String> values) {
            addCriterion("advarticle not in", values, "advarticle");
            return (Criteria) this;
        }

        public Criteria andAdvarticleBetween(String value1, String value2) {
            addCriterion("advarticle between", value1, value2, "advarticle");
            return (Criteria) this;
        }

        public Criteria andAdvarticleNotBetween(String value1, String value2) {
            addCriterion("advarticle not between", value1, value2, "advarticle");
            return (Criteria) this;
        }

        public Criteria andAdvurlIsNull() {
            addCriterion("advurl is null");
            return (Criteria) this;
        }

        public Criteria andAdvurlIsNotNull() {
            addCriterion("advurl is not null");
            return (Criteria) this;
        }

        public Criteria andAdvurlEqualTo(String value) {
            addCriterion("advurl =", value, "advurl");
            return (Criteria) this;
        }

        public Criteria andAdvurlNotEqualTo(String value) {
            addCriterion("advurl <>", value, "advurl");
            return (Criteria) this;
        }

        public Criteria andAdvurlGreaterThan(String value) {
            addCriterion("advurl >", value, "advurl");
            return (Criteria) this;
        }

        public Criteria andAdvurlGreaterThanOrEqualTo(String value) {
            addCriterion("advurl >=", value, "advurl");
            return (Criteria) this;
        }

        public Criteria andAdvurlLessThan(String value) {
            addCriterion("advurl <", value, "advurl");
            return (Criteria) this;
        }

        public Criteria andAdvurlLessThanOrEqualTo(String value) {
            addCriterion("advurl <=", value, "advurl");
            return (Criteria) this;
        }

        public Criteria andAdvurlLike(String value) {
            addCriterion("advurl like", value, "advurl");
            return (Criteria) this;
        }

        public Criteria andAdvurlNotLike(String value) {
            addCriterion("advurl not like", value, "advurl");
            return (Criteria) this;
        }

        public Criteria andAdvurlIn(List<String> values) {
            addCriterion("advurl in", values, "advurl");
            return (Criteria) this;
        }

        public Criteria andAdvurlNotIn(List<String> values) {
            addCriterion("advurl not in", values, "advurl");
            return (Criteria) this;
        }

        public Criteria andAdvurlBetween(String value1, String value2) {
            addCriterion("advurl between", value1, value2, "advurl");
            return (Criteria) this;
        }

        public Criteria andAdvurlNotBetween(String value1, String value2) {
            addCriterion("advurl not between", value1, value2, "advurl");
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