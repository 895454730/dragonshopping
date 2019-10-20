package com.hzq.dragonshopping.entity;

/**
 * 购物车实体
 */
public class ShoppingCartEntity {
    private Integer id;
    //用户id
    private Integer user_id;
    //商品id
    private Integer produce_id;
    //购物车中此商品的数量
    private Integer cart_produce_count;
    //创建时间
    private String create_time;
    //更新时间
    private  String update_time;

    public ShoppingCartEntity() {
        super();
    }

    public ShoppingCartEntity(Integer id, Integer user_id, Integer produce_id, Integer cart_produce_count, String create_time, String update_time) {
        this.id = id;
        this.user_id = user_id;
        this.produce_id = produce_id;
        this.cart_produce_count = cart_produce_count;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getProduce_id() {
        return produce_id;
    }

    public void setProduce_id(Integer produce_id) {
        this.produce_id = produce_id;
    }

    public Integer getCart_produce_count() {
        return cart_produce_count;
    }

    public void setCart_produce_count(Integer cart_produce_count) {
        this.cart_produce_count = cart_produce_count;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    @Override
    public String toString() {
        return "ShoppingCartEntity{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", produce_id=" + produce_id +
                ", cart_produce_count=" + cart_produce_count +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                '}';
    }
}
