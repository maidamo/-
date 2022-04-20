/**
 * OeNotice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weaver.interfaces.zb.zt.franchiseereturnwebservice;

public class OeNotice  extends weaver.interfaces.zb.zt.franchiseereturnwebservice.BaseDTO  implements java.io.Serializable {
    private java.lang.String businessScopeId;

    private java.lang.String businessScopeIdList;

    private java.lang.String content;

    private java.lang.Long createUserId;

    private java.lang.String creationDate1;

    private java.lang.String enableFlag;

    private weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderFile[] fileList;

    private java.lang.String forWard;

    private java.lang.String isshare;

    private java.lang.String noticeCity;

    private java.lang.String noticeDateEnd;

    private java.lang.String noticeDateStart;

    private java.lang.Long noticeId;

    private java.lang.Long noticeInfoId;

    private java.lang.String noticeNum;

    private java.lang.String orgCode;

    private java.lang.String pageFrom;

    private java.lang.Long programApplicationId;

    private java.util.Calendar programUpdateDate;

    private java.lang.String range;

    private java.lang.String readDate;

    private java.lang.String readFlag;

    private int readNum;

    private java.lang.String releaseDate;

    private java.lang.String releaseUser;

    private java.lang.String releaseUserName;

    private java.lang.String release_user;

    private java.lang.String share;

    private java.lang.String title;

    private java.lang.String type;

    private java.lang.String unitName;

    private int unreadNum;

    private java.lang.Long userId;

    private java.lang.String userName;

    public OeNotice() {
    }

    public OeNotice(
           java.lang.String attribute1,
           java.lang.String attribute10,
           java.lang.String attribute11,
           java.lang.String attribute12,
           java.lang.String attribute13,
           java.lang.String attribute14,
           java.lang.String attribute15,
           java.lang.String attribute2,
           java.lang.String attribute3,
           java.lang.String attribute4,
           java.lang.String attribute5,
           java.lang.String attribute6,
           java.lang.String attribute7,
           java.lang.String attribute8,
           java.lang.String attribute9,
           java.lang.String attributeCategory,
           java.lang.Long createdBy,
           java.util.Calendar creationDate,
           java.util.Calendar lastUpdateDate,
           java.lang.Long lastUpdateLogin,
           java.lang.Long lastUpdatedBy,
           java.lang.Long objectVersionNumber,
           java.lang.Long programId,
           java.lang.Long requestId,
           java.lang.String sortname,
           java.lang.String sortorder,
           java.lang.String __id,
           java.lang.String __status,
           java.lang.String _token,
           java.lang.String businessScopeId,
           java.lang.String businessScopeIdList,
           java.lang.String content,
           java.lang.Long createUserId,
           java.lang.String creationDate1,
           java.lang.String enableFlag,
           weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderFile[] fileList,
           java.lang.String forWard,
           java.lang.String isshare,
           java.lang.String noticeCity,
           java.lang.String noticeDateEnd,
           java.lang.String noticeDateStart,
           java.lang.Long noticeId,
           java.lang.Long noticeInfoId,
           java.lang.String noticeNum,
           java.lang.String orgCode,
           java.lang.String pageFrom,
           java.lang.Long programApplicationId,
           java.util.Calendar programUpdateDate,
           java.lang.String range,
           java.lang.String readDate,
           java.lang.String readFlag,
           int readNum,
           java.lang.String releaseDate,
           java.lang.String releaseUser,
           java.lang.String releaseUserName,
           java.lang.String release_user,
           java.lang.String share,
           java.lang.String title,
           java.lang.String type,
           java.lang.String unitName,
           int unreadNum,
           java.lang.Long userId,
           java.lang.String userName) {
        super(
            attribute1,
            attribute10,
            attribute11,
            attribute12,
            attribute13,
            attribute14,
            attribute15,
            attribute2,
            attribute3,
            attribute4,
            attribute5,
            attribute6,
            attribute7,
            attribute8,
            attribute9,
            attributeCategory,
            createdBy,
            creationDate,
            lastUpdateDate,
            lastUpdateLogin,
            lastUpdatedBy,
            objectVersionNumber,
            programId,
            requestId,
            sortname,
            sortorder,
            __id,
            __status,
            _token);
        this.businessScopeId = businessScopeId;
        this.businessScopeIdList = businessScopeIdList;
        this.content = content;
        this.createUserId = createUserId;
        this.creationDate1 = creationDate1;
        this.enableFlag = enableFlag;
        this.fileList = fileList;
        this.forWard = forWard;
        this.isshare = isshare;
        this.noticeCity = noticeCity;
        this.noticeDateEnd = noticeDateEnd;
        this.noticeDateStart = noticeDateStart;
        this.noticeId = noticeId;
        this.noticeInfoId = noticeInfoId;
        this.noticeNum = noticeNum;
        this.orgCode = orgCode;
        this.pageFrom = pageFrom;
        this.programApplicationId = programApplicationId;
        this.programUpdateDate = programUpdateDate;
        this.range = range;
        this.readDate = readDate;
        this.readFlag = readFlag;
        this.readNum = readNum;
        this.releaseDate = releaseDate;
        this.releaseUser = releaseUser;
        this.releaseUserName = releaseUserName;
        this.release_user = release_user;
        this.share = share;
        this.title = title;
        this.type = type;
        this.unitName = unitName;
        this.unreadNum = unreadNum;
        this.userId = userId;
        this.userName = userName;
    }


    /**
     * Gets the businessScopeId value for this OeNotice.
     * 
     * @return businessScopeId
     */
    public java.lang.String getBusinessScopeId() {
        return businessScopeId;
    }


    /**
     * Sets the businessScopeId value for this OeNotice.
     * 
     * @param businessScopeId
     */
    public void setBusinessScopeId(java.lang.String businessScopeId) {
        this.businessScopeId = businessScopeId;
    }


    /**
     * Gets the businessScopeIdList value for this OeNotice.
     * 
     * @return businessScopeIdList
     */
    public java.lang.String getBusinessScopeIdList() {
        return businessScopeIdList;
    }


    /**
     * Sets the businessScopeIdList value for this OeNotice.
     * 
     * @param businessScopeIdList
     */
    public void setBusinessScopeIdList(java.lang.String businessScopeIdList) {
        this.businessScopeIdList = businessScopeIdList;
    }


    /**
     * Gets the content value for this OeNotice.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this OeNotice.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the createUserId value for this OeNotice.
     * 
     * @return createUserId
     */
    public java.lang.Long getCreateUserId() {
        return createUserId;
    }


    /**
     * Sets the createUserId value for this OeNotice.
     * 
     * @param createUserId
     */
    public void setCreateUserId(java.lang.Long createUserId) {
        this.createUserId = createUserId;
    }


    /**
     * Gets the creationDate1 value for this OeNotice.
     * 
     * @return creationDate1
     */
    public java.lang.String getCreationDate1() {
        return creationDate1;
    }


    /**
     * Sets the creationDate1 value for this OeNotice.
     * 
     * @param creationDate1
     */
    public void setCreationDate1(java.lang.String creationDate1) {
        this.creationDate1 = creationDate1;
    }


    /**
     * Gets the enableFlag value for this OeNotice.
     * 
     * @return enableFlag
     */
    public java.lang.String getEnableFlag() {
        return enableFlag;
    }


    /**
     * Sets the enableFlag value for this OeNotice.
     * 
     * @param enableFlag
     */
    public void setEnableFlag(java.lang.String enableFlag) {
        this.enableFlag = enableFlag;
    }


    /**
     * Gets the fileList value for this OeNotice.
     * 
     * @return fileList
     */
    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderFile[] getFileList() {
        return fileList;
    }


    /**
     * Sets the fileList value for this OeNotice.
     * 
     * @param fileList
     */
    public void setFileList(weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderFile[] fileList) {
        this.fileList = fileList;
    }

    public weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderFile getFileList(int i) {
        return this.fileList[i];
    }

    public void setFileList(int i, weaver.interfaces.zb.zt.franchiseereturnwebservice.OrderFile _value) {
        this.fileList[i] = _value;
    }


    /**
     * Gets the forWard value for this OeNotice.
     * 
     * @return forWard
     */
    public java.lang.String getForWard() {
        return forWard;
    }


    /**
     * Sets the forWard value for this OeNotice.
     * 
     * @param forWard
     */
    public void setForWard(java.lang.String forWard) {
        this.forWard = forWard;
    }


    /**
     * Gets the isshare value for this OeNotice.
     * 
     * @return isshare
     */
    public java.lang.String getIsshare() {
        return isshare;
    }


    /**
     * Sets the isshare value for this OeNotice.
     * 
     * @param isshare
     */
    public void setIsshare(java.lang.String isshare) {
        this.isshare = isshare;
    }


    /**
     * Gets the noticeCity value for this OeNotice.
     * 
     * @return noticeCity
     */
    public java.lang.String getNoticeCity() {
        return noticeCity;
    }


    /**
     * Sets the noticeCity value for this OeNotice.
     * 
     * @param noticeCity
     */
    public void setNoticeCity(java.lang.String noticeCity) {
        this.noticeCity = noticeCity;
    }


    /**
     * Gets the noticeDateEnd value for this OeNotice.
     * 
     * @return noticeDateEnd
     */
    public java.lang.String getNoticeDateEnd() {
        return noticeDateEnd;
    }


    /**
     * Sets the noticeDateEnd value for this OeNotice.
     * 
     * @param noticeDateEnd
     */
    public void setNoticeDateEnd(java.lang.String noticeDateEnd) {
        this.noticeDateEnd = noticeDateEnd;
    }


    /**
     * Gets the noticeDateStart value for this OeNotice.
     * 
     * @return noticeDateStart
     */
    public java.lang.String getNoticeDateStart() {
        return noticeDateStart;
    }


    /**
     * Sets the noticeDateStart value for this OeNotice.
     * 
     * @param noticeDateStart
     */
    public void setNoticeDateStart(java.lang.String noticeDateStart) {
        this.noticeDateStart = noticeDateStart;
    }


    /**
     * Gets the noticeId value for this OeNotice.
     * 
     * @return noticeId
     */
    public java.lang.Long getNoticeId() {
        return noticeId;
    }


    /**
     * Sets the noticeId value for this OeNotice.
     * 
     * @param noticeId
     */
    public void setNoticeId(java.lang.Long noticeId) {
        this.noticeId = noticeId;
    }


    /**
     * Gets the noticeInfoId value for this OeNotice.
     * 
     * @return noticeInfoId
     */
    public java.lang.Long getNoticeInfoId() {
        return noticeInfoId;
    }


    /**
     * Sets the noticeInfoId value for this OeNotice.
     * 
     * @param noticeInfoId
     */
    public void setNoticeInfoId(java.lang.Long noticeInfoId) {
        this.noticeInfoId = noticeInfoId;
    }


    /**
     * Gets the noticeNum value for this OeNotice.
     * 
     * @return noticeNum
     */
    public java.lang.String getNoticeNum() {
        return noticeNum;
    }


    /**
     * Sets the noticeNum value for this OeNotice.
     * 
     * @param noticeNum
     */
    public void setNoticeNum(java.lang.String noticeNum) {
        this.noticeNum = noticeNum;
    }


    /**
     * Gets the orgCode value for this OeNotice.
     * 
     * @return orgCode
     */
    public java.lang.String getOrgCode() {
        return orgCode;
    }


    /**
     * Sets the orgCode value for this OeNotice.
     * 
     * @param orgCode
     */
    public void setOrgCode(java.lang.String orgCode) {
        this.orgCode = orgCode;
    }


    /**
     * Gets the pageFrom value for this OeNotice.
     * 
     * @return pageFrom
     */
    public java.lang.String getPageFrom() {
        return pageFrom;
    }


    /**
     * Sets the pageFrom value for this OeNotice.
     * 
     * @param pageFrom
     */
    public void setPageFrom(java.lang.String pageFrom) {
        this.pageFrom = pageFrom;
    }


    /**
     * Gets the programApplicationId value for this OeNotice.
     * 
     * @return programApplicationId
     */
    public java.lang.Long getProgramApplicationId() {
        return programApplicationId;
    }


    /**
     * Sets the programApplicationId value for this OeNotice.
     * 
     * @param programApplicationId
     */
    public void setProgramApplicationId(java.lang.Long programApplicationId) {
        this.programApplicationId = programApplicationId;
    }


    /**
     * Gets the programUpdateDate value for this OeNotice.
     * 
     * @return programUpdateDate
     */
    public java.util.Calendar getProgramUpdateDate() {
        return programUpdateDate;
    }


    /**
     * Sets the programUpdateDate value for this OeNotice.
     * 
     * @param programUpdateDate
     */
    public void setProgramUpdateDate(java.util.Calendar programUpdateDate) {
        this.programUpdateDate = programUpdateDate;
    }


    /**
     * Gets the range value for this OeNotice.
     * 
     * @return range
     */
    public java.lang.String getRange() {
        return range;
    }


    /**
     * Sets the range value for this OeNotice.
     * 
     * @param range
     */
    public void setRange(java.lang.String range) {
        this.range = range;
    }


    /**
     * Gets the readDate value for this OeNotice.
     * 
     * @return readDate
     */
    public java.lang.String getReadDate() {
        return readDate;
    }


    /**
     * Sets the readDate value for this OeNotice.
     * 
     * @param readDate
     */
    public void setReadDate(java.lang.String readDate) {
        this.readDate = readDate;
    }


    /**
     * Gets the readFlag value for this OeNotice.
     * 
     * @return readFlag
     */
    public java.lang.String getReadFlag() {
        return readFlag;
    }


    /**
     * Sets the readFlag value for this OeNotice.
     * 
     * @param readFlag
     */
    public void setReadFlag(java.lang.String readFlag) {
        this.readFlag = readFlag;
    }


    /**
     * Gets the readNum value for this OeNotice.
     * 
     * @return readNum
     */
    public int getReadNum() {
        return readNum;
    }


    /**
     * Sets the readNum value for this OeNotice.
     * 
     * @param readNum
     */
    public void setReadNum(int readNum) {
        this.readNum = readNum;
    }


    /**
     * Gets the releaseDate value for this OeNotice.
     * 
     * @return releaseDate
     */
    public java.lang.String getReleaseDate() {
        return releaseDate;
    }


    /**
     * Sets the releaseDate value for this OeNotice.
     * 
     * @param releaseDate
     */
    public void setReleaseDate(java.lang.String releaseDate) {
        this.releaseDate = releaseDate;
    }


    /**
     * Gets the releaseUser value for this OeNotice.
     * 
     * @return releaseUser
     */
    public java.lang.String getReleaseUser() {
        return releaseUser;
    }


    /**
     * Sets the releaseUser value for this OeNotice.
     * 
     * @param releaseUser
     */
    public void setReleaseUser(java.lang.String releaseUser) {
        this.releaseUser = releaseUser;
    }


    /**
     * Gets the releaseUserName value for this OeNotice.
     * 
     * @return releaseUserName
     */
    public java.lang.String getReleaseUserName() {
        return releaseUserName;
    }


    /**
     * Sets the releaseUserName value for this OeNotice.
     * 
     * @param releaseUserName
     */
    public void setReleaseUserName(java.lang.String releaseUserName) {
        this.releaseUserName = releaseUserName;
    }


    /**
     * Gets the release_user value for this OeNotice.
     * 
     * @return release_user
     */
    public java.lang.String getRelease_user() {
        return release_user;
    }


    /**
     * Sets the release_user value for this OeNotice.
     * 
     * @param release_user
     */
    public void setRelease_user(java.lang.String release_user) {
        this.release_user = release_user;
    }


    /**
     * Gets the share value for this OeNotice.
     * 
     * @return share
     */
    public java.lang.String getShare() {
        return share;
    }


    /**
     * Sets the share value for this OeNotice.
     * 
     * @param share
     */
    public void setShare(java.lang.String share) {
        this.share = share;
    }


    /**
     * Gets the title value for this OeNotice.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this OeNotice.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the type value for this OeNotice.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this OeNotice.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the unitName value for this OeNotice.
     * 
     * @return unitName
     */
    public java.lang.String getUnitName() {
        return unitName;
    }


    /**
     * Sets the unitName value for this OeNotice.
     * 
     * @param unitName
     */
    public void setUnitName(java.lang.String unitName) {
        this.unitName = unitName;
    }


    /**
     * Gets the unreadNum value for this OeNotice.
     * 
     * @return unreadNum
     */
    public int getUnreadNum() {
        return unreadNum;
    }


    /**
     * Sets the unreadNum value for this OeNotice.
     * 
     * @param unreadNum
     */
    public void setUnreadNum(int unreadNum) {
        this.unreadNum = unreadNum;
    }


    /**
     * Gets the userId value for this OeNotice.
     * 
     * @return userId
     */
    public java.lang.Long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this OeNotice.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Long userId) {
        this.userId = userId;
    }


    /**
     * Gets the userName value for this OeNotice.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this OeNotice.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OeNotice)) return false;
        OeNotice other = (OeNotice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.businessScopeId==null && other.getBusinessScopeId()==null) || 
             (this.businessScopeId!=null &&
              this.businessScopeId.equals(other.getBusinessScopeId()))) &&
            ((this.businessScopeIdList==null && other.getBusinessScopeIdList()==null) || 
             (this.businessScopeIdList!=null &&
              this.businessScopeIdList.equals(other.getBusinessScopeIdList()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.createUserId==null && other.getCreateUserId()==null) || 
             (this.createUserId!=null &&
              this.createUserId.equals(other.getCreateUserId()))) &&
            ((this.creationDate1==null && other.getCreationDate1()==null) || 
             (this.creationDate1!=null &&
              this.creationDate1.equals(other.getCreationDate1()))) &&
            ((this.enableFlag==null && other.getEnableFlag()==null) || 
             (this.enableFlag!=null &&
              this.enableFlag.equals(other.getEnableFlag()))) &&
            ((this.fileList==null && other.getFileList()==null) || 
             (this.fileList!=null &&
              java.util.Arrays.equals(this.fileList, other.getFileList()))) &&
            ((this.forWard==null && other.getForWard()==null) || 
             (this.forWard!=null &&
              this.forWard.equals(other.getForWard()))) &&
            ((this.isshare==null && other.getIsshare()==null) || 
             (this.isshare!=null &&
              this.isshare.equals(other.getIsshare()))) &&
            ((this.noticeCity==null && other.getNoticeCity()==null) || 
             (this.noticeCity!=null &&
              this.noticeCity.equals(other.getNoticeCity()))) &&
            ((this.noticeDateEnd==null && other.getNoticeDateEnd()==null) || 
             (this.noticeDateEnd!=null &&
              this.noticeDateEnd.equals(other.getNoticeDateEnd()))) &&
            ((this.noticeDateStart==null && other.getNoticeDateStart()==null) || 
             (this.noticeDateStart!=null &&
              this.noticeDateStart.equals(other.getNoticeDateStart()))) &&
            ((this.noticeId==null && other.getNoticeId()==null) || 
             (this.noticeId!=null &&
              this.noticeId.equals(other.getNoticeId()))) &&
            ((this.noticeInfoId==null && other.getNoticeInfoId()==null) || 
             (this.noticeInfoId!=null &&
              this.noticeInfoId.equals(other.getNoticeInfoId()))) &&
            ((this.noticeNum==null && other.getNoticeNum()==null) || 
             (this.noticeNum!=null &&
              this.noticeNum.equals(other.getNoticeNum()))) &&
            ((this.orgCode==null && other.getOrgCode()==null) || 
             (this.orgCode!=null &&
              this.orgCode.equals(other.getOrgCode()))) &&
            ((this.pageFrom==null && other.getPageFrom()==null) || 
             (this.pageFrom!=null &&
              this.pageFrom.equals(other.getPageFrom()))) &&
            ((this.programApplicationId==null && other.getProgramApplicationId()==null) || 
             (this.programApplicationId!=null &&
              this.programApplicationId.equals(other.getProgramApplicationId()))) &&
            ((this.programUpdateDate==null && other.getProgramUpdateDate()==null) || 
             (this.programUpdateDate!=null &&
              this.programUpdateDate.equals(other.getProgramUpdateDate()))) &&
            ((this.range==null && other.getRange()==null) || 
             (this.range!=null &&
              this.range.equals(other.getRange()))) &&
            ((this.readDate==null && other.getReadDate()==null) || 
             (this.readDate!=null &&
              this.readDate.equals(other.getReadDate()))) &&
            ((this.readFlag==null && other.getReadFlag()==null) || 
             (this.readFlag!=null &&
              this.readFlag.equals(other.getReadFlag()))) &&
            this.readNum == other.getReadNum() &&
            ((this.releaseDate==null && other.getReleaseDate()==null) || 
             (this.releaseDate!=null &&
              this.releaseDate.equals(other.getReleaseDate()))) &&
            ((this.releaseUser==null && other.getReleaseUser()==null) || 
             (this.releaseUser!=null &&
              this.releaseUser.equals(other.getReleaseUser()))) &&
            ((this.releaseUserName==null && other.getReleaseUserName()==null) || 
             (this.releaseUserName!=null &&
              this.releaseUserName.equals(other.getReleaseUserName()))) &&
            ((this.release_user==null && other.getRelease_user()==null) || 
             (this.release_user!=null &&
              this.release_user.equals(other.getRelease_user()))) &&
            ((this.share==null && other.getShare()==null) || 
             (this.share!=null &&
              this.share.equals(other.getShare()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.unitName==null && other.getUnitName()==null) || 
             (this.unitName!=null &&
              this.unitName.equals(other.getUnitName()))) &&
            this.unreadNum == other.getUnreadNum() &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getBusinessScopeId() != null) {
            _hashCode += getBusinessScopeId().hashCode();
        }
        if (getBusinessScopeIdList() != null) {
            _hashCode += getBusinessScopeIdList().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getCreateUserId() != null) {
            _hashCode += getCreateUserId().hashCode();
        }
        if (getCreationDate1() != null) {
            _hashCode += getCreationDate1().hashCode();
        }
        if (getEnableFlag() != null) {
            _hashCode += getEnableFlag().hashCode();
        }
        if (getFileList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFileList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFileList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getForWard() != null) {
            _hashCode += getForWard().hashCode();
        }
        if (getIsshare() != null) {
            _hashCode += getIsshare().hashCode();
        }
        if (getNoticeCity() != null) {
            _hashCode += getNoticeCity().hashCode();
        }
        if (getNoticeDateEnd() != null) {
            _hashCode += getNoticeDateEnd().hashCode();
        }
        if (getNoticeDateStart() != null) {
            _hashCode += getNoticeDateStart().hashCode();
        }
        if (getNoticeId() != null) {
            _hashCode += getNoticeId().hashCode();
        }
        if (getNoticeInfoId() != null) {
            _hashCode += getNoticeInfoId().hashCode();
        }
        if (getNoticeNum() != null) {
            _hashCode += getNoticeNum().hashCode();
        }
        if (getOrgCode() != null) {
            _hashCode += getOrgCode().hashCode();
        }
        if (getPageFrom() != null) {
            _hashCode += getPageFrom().hashCode();
        }
        if (getProgramApplicationId() != null) {
            _hashCode += getProgramApplicationId().hashCode();
        }
        if (getProgramUpdateDate() != null) {
            _hashCode += getProgramUpdateDate().hashCode();
        }
        if (getRange() != null) {
            _hashCode += getRange().hashCode();
        }
        if (getReadDate() != null) {
            _hashCode += getReadDate().hashCode();
        }
        if (getReadFlag() != null) {
            _hashCode += getReadFlag().hashCode();
        }
        _hashCode += getReadNum();
        if (getReleaseDate() != null) {
            _hashCode += getReleaseDate().hashCode();
        }
        if (getReleaseUser() != null) {
            _hashCode += getReleaseUser().hashCode();
        }
        if (getReleaseUserName() != null) {
            _hashCode += getReleaseUserName().hashCode();
        }
        if (getRelease_user() != null) {
            _hashCode += getRelease_user().hashCode();
        }
        if (getShare() != null) {
            _hashCode += getShare().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUnitName() != null) {
            _hashCode += getUnitName().hashCode();
        }
        _hashCode += getUnreadNum();
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OeNotice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "oeNotice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessScopeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessScopeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessScopeIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessScopeIdList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationDate1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enableFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.itf.core.crm/", "orderFile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forWard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forWard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isshare");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isshare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noticeCity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noticeCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noticeDateEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noticeDateEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noticeDateStart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noticeDateStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noticeId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noticeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noticeInfoId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noticeInfoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noticeNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noticeNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orgCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programApplicationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "programApplicationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "programUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("range");
        elemField.setXmlName(new javax.xml.namespace.QName("", "range"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "releaseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "releaseUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "releaseUserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("release_user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "release_user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("share");
        elemField.setXmlName(new javax.xml.namespace.QName("", "share"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unreadNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unreadNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
