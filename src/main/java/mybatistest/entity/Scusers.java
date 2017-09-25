package mybatistest.entity;
// Generated 2014-11-19 9:41:30 by Hibernate Tools 3.4.0.CR1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Scusers generated by hbm2java
 */
public class Scusers  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = -4033619360964274061L;
	private String userid;
     private BigDecimal orderno;
     private String userno;
     private String username;
     private String password;
     private String departmentid;
     private String employeeid;
     private String partnerid;
     private String mobilenumber;
     private String emailaddress;
     private String remark;
     private String locked;
     private Date lastlogin;
     private Date lastpwdset;
     private Date pwdexdate;
     private String createuserid;
     private Date createdate;
     private String updateuserid;
     private Date updatedate;
     private String owneruserid;
     private String ownerdepartmentid;
     private String im;
     private String userTestApp;

    public Scusers() {
    }

	
    public Scusers(String userid) {
        this.userid = userid;
    }
    public Scusers(String userid, BigDecimal orderno, String userno, String username, String password, String departmentid, String employeeid, String partnerid, String mobilenumber, String emailaddress, String remark, String locked, Date lastlogin, Date lastpwdset, Date pwdexdate, String createuserid, Date createdate, String updateuserid, Date updatedate, String owneruserid, String ownerdepartmentid, String im, String userTestApp) {
       this.userid = userid;
       this.orderno = orderno;
       this.userno = userno;
       this.username = username;
       this.password = password;
       this.departmentid = departmentid;
       this.employeeid = employeeid;
       this.partnerid = partnerid;
       this.mobilenumber = mobilenumber;
       this.emailaddress = emailaddress;
       this.remark = remark;
       this.locked = locked;
       this.lastlogin = lastlogin;
       this.lastpwdset = lastpwdset;
       this.pwdexdate = pwdexdate;
       this.createuserid = createuserid;
       this.createdate = createdate;
       this.updateuserid = updateuserid;
       this.updatedate = updatedate;
       this.owneruserid = owneruserid;
       this.ownerdepartmentid = ownerdepartmentid;
       this.im = im;
       this.userTestApp = userTestApp;
    }
   
    public String getUserid() {
        return this.userid;
    }
    
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public BigDecimal getOrderno() {
        return this.orderno;
    }
    
    public void setOrderno(BigDecimal orderno) {
        this.orderno = orderno;
    }
    public String getUserno() {
        return this.userno;
    }
    
    public void setUserno(String userno) {
        this.userno = userno;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getDepartmentid() {
        return this.departmentid;
    }
    
    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }
    public String getEmployeeid() {
        return this.employeeid;
    }
    
    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }
    public String getPartnerid() {
        return this.partnerid;
    }
    
    public void setPartnerid(String partnerid) {
        this.partnerid = partnerid;
    }
    public String getMobilenumber() {
        return this.mobilenumber;
    }
    
    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
    }
    public String getEmailaddress() {
        return this.emailaddress;
    }
    
    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }
    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getLocked() {
        return this.locked;
    }
    
    public void setLocked(String locked) {
        this.locked = locked;
    }
    public Date getLastlogin() {
        return this.lastlogin;
    }
    
    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }
    public Date getLastpwdset() {
        return this.lastpwdset;
    }
    
    public void setLastpwdset(Date lastpwdset) {
        this.lastpwdset = lastpwdset;
    }
    public Date getPwdexdate() {
        return this.pwdexdate;
    }
    
    public void setPwdexdate(Date pwdexdate) {
        this.pwdexdate = pwdexdate;
    }
    public String getCreateuserid() {
        return this.createuserid;
    }
    
    public void setCreateuserid(String createuserid) {
        this.createuserid = createuserid;
    }
    public Date getCreatedate() {
        return this.createdate;
    }
    
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
    public String getUpdateuserid() {
        return this.updateuserid;
    }
    
    public void setUpdateuserid(String updateuserid) {
        this.updateuserid = updateuserid;
    }
    public Date getUpdatedate() {
        return this.updatedate;
    }
    
    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }
    public String getOwneruserid() {
        return this.owneruserid;
    }
    
    public void setOwneruserid(String owneruserid) {
        this.owneruserid = owneruserid;
    }
    public String getOwnerdepartmentid() {
        return this.ownerdepartmentid;
    }
    
    public void setOwnerdepartmentid(String ownerdepartmentid) {
        this.ownerdepartmentid = ownerdepartmentid;
    }
    public String getIm() {
        return this.im;
    }
    
    public void setIm(String im) {
        this.im = im;
    }
    public String getUserTestApp() {
        return this.userTestApp;
    }
    
    public void setUserTestApp(String userTestApp) {
        this.userTestApp = userTestApp;
    }




}


