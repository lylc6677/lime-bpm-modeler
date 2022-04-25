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
package com.lime.bpm.modeler.model;

import com.lime.bpm.modeler.domain.AbstractModel;
import com.lime.bpm.modeler.domain.Model;
import com.lime.bpm.modeler.domain.ModelHistory;
import org.flowable.ui.common.model.AbstractRepresentation;

import java.util.Date;

/**
 * Representation of process-models, both current and historic models.
 *
 * @author Tijs Rademakers
 */
public class ModelRepresentation extends AbstractRepresentation {

    protected String id;
    protected String name;
    protected String key;
    protected String description;
    protected String createdBy;
    protected String lastUpdatedBy;
    protected Date lastUpdated;
    protected boolean latestVersion;
    protected int version;
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
    /**
     * 是否支持共享，true支持，false不支持
     */
    protected boolean isShare;
    /**
     * 单位条件
     */
    protected String unitCondition;
    /**
     * 单位回显
     */
    protected String unitCode;

    public ModelRepresentation(AbstractModel model) {
        initialize(model);
    }

    public ModelRepresentation() {

    }

    public void initialize(AbstractModel model) {
        this.id = model.getId();
        this.name = model.getName();
        this.key = model.getKey();
        this.description = model.getDescription();
        this.createdBy = model.getCreatedBy();
        this.lastUpdated = model.getLastUpdated();
        this.version = model.getVersion();
        this.lastUpdatedBy = model.getLastUpdatedBy();
        this.comment = model.getComment();
        this.modelType = model.getModelType();
        this.tenantId = model.getTenantId();

        this.appTypeCode = model.getAppTypeCode();
        this.bizTypeCode = model.getBizTypeCode();
        this.region = model.getRegion();
        this.agency = model.getAgency();
        this.appTypeName = model.getAppTypeName();
        this.bizTypeName = model.getBizTypeName();
        this.rgName = model.getRgName();
        this.unitName = model.getUnitName();
        this.isShare = model.getIsShare();
        this.unitCode = model.getUnitCode();
        this.unitCondition = model.getUnitCondition();

        // When based on a ProcessModel and not history, this is always the latest version
        if (model instanceof Model) {
            this.setLatestVersion(true);
        } else if (model instanceof ModelHistory) {
            this.setLatestVersion(false);
        }
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

    public void setLatestVersion(boolean latestVersion) {
        this.latestVersion = latestVersion;
    }

    public boolean isLatestVersion() {
        return latestVersion;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
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

    public Model toModel() {
        Model model = new Model();
        model.setName(name);
        model.setDescription(description);
        return model;
    }

    /**
     * Update all editable properties of the given {@link Model} based on the values in this instance.
     */
    public void updateModel(Model model) {
        model.setDescription(this.description);
        model.setName(this.name);
        model.setKey(this.key);
        model.setAppTypeCode(this.getAppTypeCode());
        model.setBizTypeCode(this.getBizTypeCode());
        model.setRegion(this.getRegion());
        model.setAgency(this.getAgency());
        model.setAppTypeName(this.getAppTypeName());
        model.setBizTypeName(this.getBizTypeName());
        model.setRgName(this.getRgName());
        model.setUnitName(this.getUnitName());
        model.setIsShare(this.getIsShare());
        model.setUnitCode(this.getUnitCode());
        model.setUnitCondition(this.getUnitCondition());
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

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public boolean getIsShare() {
        return isShare;
    }

    public void setIsShare(boolean share) {
        isShare = share;
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
