package com.hbc.api.trade.order.mapping.gen;

import com.hbc.api.trade.order.mapping.gen.bean.TradeOrderDeliver;
import com.hbc.api.trade.order.mapping.gen.bean.TradeOrderDeliverExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TradeOrderDeliverMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_deliver`
     *
     * @mbggenerated
     */
    @SelectProvider(type=TradeOrderDeliverSqlProvider.class, method="countByExample")
    int countByExample(TradeOrderDeliverExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_deliver`
     *
     * @mbggenerated
     */
    @DeleteProvider(type=TradeOrderDeliverSqlProvider.class, method="deleteByExample")
    int deleteByExample(TradeOrderDeliverExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_deliver`
     *
     * @mbggenerated
     */
    @Delete({
        "delete from `trade_deliver`",
        "where deliver_no = #{deliverNo,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String deliverNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_deliver`
     *
     * @mbggenerated
     */
    @Insert({
        "insert into `trade_deliver` (deliver_no, order_no, ",
        "deliver_type, deliver_type_name, ",
        "deliver_status, deliver_status_name, ",
        "pk_status, pk_status_name, ",
        "deliver_count, guide_receive_count, ",
        "city_id, deliver_time, ",
        "pk_time, update_time, ",
        "create_time)",
        "values (#{deliverNo,jdbcType=VARCHAR}, #{orderNo,jdbcType=VARCHAR}, ",
        "#{deliverType,jdbcType=INTEGER}, #{deliverTypeName,jdbcType=VARCHAR}, ",
        "#{deliverStatus,jdbcType=INTEGER}, #{deliverStatusName,jdbcType=VARCHAR}, ",
        "#{pkStatus,jdbcType=INTEGER}, #{pkStatusName,jdbcType=VARCHAR}, ",
        "#{deliverCount,jdbcType=INTEGER}, #{guideReceiveCount,jdbcType=INTEGER}, ",
        "#{cityId,jdbcType=INTEGER}, #{deliverTime,jdbcType=TIMESTAMP}, ",
        "#{pkTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP}, ",
        "#{createTime,jdbcType=TIMESTAMP})"
    })
    int insert(TradeOrderDeliver record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_deliver`
     *
     * @mbggenerated
     */
    @InsertProvider(type=TradeOrderDeliverSqlProvider.class, method="insertSelective")
    int insertSelective(TradeOrderDeliver record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_deliver`
     *
     * @mbggenerated
     */
    @SelectProvider(type=TradeOrderDeliverSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="deliver_no", property="deliverNo", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="order_no", property="orderNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="deliver_type", property="deliverType", jdbcType=JdbcType.INTEGER),
        @Result(column="deliver_type_name", property="deliverTypeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="deliver_status", property="deliverStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="deliver_status_name", property="deliverStatusName", jdbcType=JdbcType.VARCHAR),
        @Result(column="pk_status", property="pkStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="pk_status_name", property="pkStatusName", jdbcType=JdbcType.VARCHAR),
        @Result(column="deliver_count", property="deliverCount", jdbcType=JdbcType.INTEGER),
        @Result(column="guide_receive_count", property="guideReceiveCount", jdbcType=JdbcType.INTEGER),
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.INTEGER),
        @Result(column="deliver_time", property="deliverTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="pk_time", property="pkTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<TradeOrderDeliver> selectByExample(TradeOrderDeliverExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_deliver`
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "deliver_no, order_no, deliver_type, deliver_type_name, deliver_status, deliver_status_name, ",
        "pk_status, pk_status_name, deliver_count, guide_receive_count, city_id, deliver_time, ",
        "pk_time, update_time, create_time",
        "from `trade_deliver`",
        "where deliver_no = #{deliverNo,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="deliver_no", property="deliverNo", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="order_no", property="orderNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="deliver_type", property="deliverType", jdbcType=JdbcType.INTEGER),
        @Result(column="deliver_type_name", property="deliverTypeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="deliver_status", property="deliverStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="deliver_status_name", property="deliverStatusName", jdbcType=JdbcType.VARCHAR),
        @Result(column="pk_status", property="pkStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="pk_status_name", property="pkStatusName", jdbcType=JdbcType.VARCHAR),
        @Result(column="deliver_count", property="deliverCount", jdbcType=JdbcType.INTEGER),
        @Result(column="guide_receive_count", property="guideReceiveCount", jdbcType=JdbcType.INTEGER),
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.INTEGER),
        @Result(column="deliver_time", property="deliverTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="pk_time", property="pkTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    TradeOrderDeliver selectByPrimaryKey(String deliverNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_deliver`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=TradeOrderDeliverSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TradeOrderDeliver record, @Param("example") TradeOrderDeliverExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table `trade_deliver`
     *
     * @mbggenerated
     */
    @UpdateProvider(type=TradeOrderDeliverSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TradeOrderDeliver record);
}