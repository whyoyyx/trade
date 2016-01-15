package com.hbc.data.trade.transfer.mapping.hbcfund.gen;

import com.hbc.data.trade.transfer.mapping.hbcfund.gen.bean.FinalSysAccount;
import com.hbc.data.trade.transfer.mapping.hbcfund.gen.bean.FinalSysAccountCriteria.Criteria;
import com.hbc.data.trade.transfer.mapping.hbcfund.gen.bean.FinalSysAccountCriteria.Criterion;
import com.hbc.data.trade.transfer.mapping.hbcfund.gen.bean.FinalSysAccountCriteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class FinalSysAccountSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccount`
     *
     * @mbggenerated
     */
    public String countByExample(FinalSysAccountCriteria example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("`sysaccount`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccount`
     *
     * @mbggenerated
     */
    public String deleteByExample(FinalSysAccountCriteria example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("`sysaccount`");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccount`
     *
     * @mbggenerated
     */
    public String insertSelective(FinalSysAccount record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("`sysaccount`");
        
        if (record.getSysaccountid() != null) {
            sql.VALUES("sysAccountId", "#{sysaccountid,jdbcType=INTEGER}");
        }
        
        if (record.getIncome() != null) {
            sql.VALUES("income", "#{income,jdbcType=INTEGER}");
        }
        
        if (record.getExpend() != null) {
            sql.VALUES("expend", "#{expend,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccount`
     *
     * @mbggenerated
     */
    public String selectByExample(FinalSysAccountCriteria example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("sysAccountId");
        } else {
            sql.SELECT("sysAccountId");
        }
        sql.SELECT("income");
        sql.SELECT("expend");
        sql.SELECT("updated_at");
        sql.SELECT("created_at");
        sql.FROM("`sysaccount`");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
         String sqlStr = sql.toString();
        if(example.getPage()!=null){
            sqlStr = sqlStr+" limit "+example.getPage().getOffset()+","+example.getPage().getLimit()+"";
             }
            return sqlStr;
        }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccount`
     *
     * @mbggenerated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        FinalSysAccount record = (FinalSysAccount) parameter.get("record");
        FinalSysAccountCriteria example = (FinalSysAccountCriteria) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("`sysaccount`");
        
        if (record.getSysaccountid() != null) {
            sql.SET("sysAccountId = #{record.sysaccountid,jdbcType=INTEGER}");
        }
        
        if (record.getIncome() != null) {
            sql.SET("income = #{record.income,jdbcType=INTEGER}");
        }
        
        if (record.getExpend() != null) {
            sql.SET("expend = #{record.expend,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccount`
     *
     * @mbggenerated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("`sysaccount`");
        
        sql.SET("sysAccountId = #{record.sysaccountid,jdbcType=INTEGER}");
        sql.SET("income = #{record.income,jdbcType=INTEGER}");
        sql.SET("expend = #{record.expend,jdbcType=INTEGER}");
        sql.SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        sql.SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        
        FinalSysAccountCriteria example = (FinalSysAccountCriteria) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccount`
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(FinalSysAccount record) {
        SQL sql = new SQL();
        sql.UPDATE("`sysaccount`");
        
        if (record.getIncome() != null) {
            sql.SET("income = #{income,jdbcType=INTEGER}");
        }
        
        if (record.getExpend() != null) {
            sql.SET("expend = #{expend,jdbcType=INTEGER}");
        }
        
        if (record.getUpdatedAt() != null) {
            sql.SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            sql.SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("sysAccountId = #{sysaccountid,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `sysaccount`
     *
     * @mbggenerated
     */
    protected void applyWhere(SQL sql, FinalSysAccountCriteria example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}