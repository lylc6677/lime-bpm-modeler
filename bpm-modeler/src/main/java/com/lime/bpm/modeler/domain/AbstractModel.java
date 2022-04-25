/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lime.bpm.modeler.domain;

import java.util.Date;

public class AbstractModel {

    public static final int MODEL_TYPE_BPMN = 0;
    public static final int MODEL_TYPE_FORM = 2;
    public static final int MODEL_TYPE_APP = 3;
    public static final int MODEL_TYPE_DECISION_TABLE = 4;
    public static final int MODEL_TYPE_CMMN = 5;

    protected String id;
    protected String name;
    protected String key;
    protected String description;
    protected Date created;
    protected Date lastUpdated;
    private String createdBy;
    private String lastUpdatedBy;
    protected int version;
    protected String modelEditorJson;
    protected String comment;
    protected Integer modelType;
    protected String tenantId;
    /**
     * 应用类型编码
     */
    protected String appTypeCode;
    /**
     * 业务类型编码
     */
    protected String bizTypeCode;
    
    /**
     * 区划
     */
    protected String region;
    
    /**
     * 单位
     */
    protected String agency;

    /**
     * 应用名称
     */
    protected String appTypeName;

    /**
     * 业务类型名称
     */
    protected String bizTypeName;

    /**
     * 区划名称
     */
    protected String rgName;

    /**
     * 单位名称
     */
    protected String unitName;

    protected boolean isShare;
    /**
     * 单位条件
     */
    protected String unitCondition;
    /**
     * 单位回显
     */
    protected String unitCode;

    public AbstractModel() {
        this.created = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getModelEditorJson() {
        return modelEditorJson;
    }

    public void setModelEditorJson(String modelEditorJson) {
        this.modelEditorJson = modelEditorJson;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public Integer getModelType() {
        return modelType;
    }

    public void setModelType(Integer modelType) {
        this.modelType = modelType;
    }

    public String getTenantId() {
        return tenantId;
    }
    
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getAppTypeCode() {
        return appTypeCode;
    }

    public void setAppTypeCode(String appTypeCode) {
        this.appTypeCode = appTypeCode;
    }

    public String getBizTypeCode() {
        return bizTypeCode;
    }

    public void setBizTypeCode(String bizTypeCode) {
        this.bizTypeCode = bizTypeCode;
    }

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

    public String getAppTypeName() {
        return appTypeName;
    }

    public void setAppTypeName(String appTypeName) {
        this.appTypeName = appTypeName;
    }

    public String getBizTypeName() {
        return bizTypeName;
    }

    public void setBizTypeName(String bizTypeName) {
        this.bizTypeName = bizTypeName;
    }

    public String getRgName() {
        return rgName;
    }

    public void setRgName(String rgName) {
        this.rgName = rgName;
    }

    public String getUnitName() {
        return unitName;
    }

    public boolean getIsShare() {
        return isShare;
    }

    public void setIsShare(boolean share) {
        isShare = share;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitCondition() {
        return unitCondition;
    }

    public void setUnitCondition(String unitCondition) {
        this.unitCondition = unitCondition;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }
}
