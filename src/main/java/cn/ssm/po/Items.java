package cn.ssm.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Items implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 241532736137540203L;

	private Integer itemsid;

    private String itemsname;

    private BigDecimal itemsprice;

    private Date createtime;

    private String itemstext;

    public Integer getItemsid() {
        return itemsid;
    }

    public void setItemsid(Integer itemsid) {
        this.itemsid = itemsid;
    }

    public String getItemsname() {
        return itemsname;
    }

    public void setItemsname(String itemsname) {
        this.itemsname = itemsname == null ? null : itemsname.trim();
    }

    public BigDecimal getItemsprice() {
        return itemsprice;
    }

    public void setItemsprice(BigDecimal itemsprice) {
        this.itemsprice = itemsprice;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getItemstext() {
        return itemstext;
    }

    public void setItemstext(String itemstext) {
        this.itemstext = itemstext == null ? null : itemstext.trim();
    }
}