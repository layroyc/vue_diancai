package com.xiexin.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * foods
 * @author 
 */
public class Foods implements Serializable {
    private Integer foodId;

    private String foodName;

    private Integer foodPrice;

    private Integer foodCount;

    private Date foodStartDate;

    private Date foodEndDate;

    private String foodPic;

    private static final long serialVersionUID = 1L;

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Integer getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Integer foodPrice) {
        this.foodPrice = foodPrice;
    }

    public Integer getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(Integer foodCount) {
        this.foodCount = foodCount;
    }

    public Date getFoodStartDate() {
        return foodStartDate;
    }

    public void setFoodStartDate(Date foodStartDate) {
        this.foodStartDate = foodStartDate;
    }

    public Date getFoodEndDate() {
        return foodEndDate;
    }

    public void setFoodEndDate(Date foodEndDate) {
        this.foodEndDate = foodEndDate;
    }

    public String getFoodPic() {
        return foodPic;
    }

    public void setFoodPic(String foodPic) {
        this.foodPic = foodPic;
    }
}