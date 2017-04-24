package co.com.binariasystems.orion.model.dto;

import java.io.Serializable;

import co.com.binariasystems.fmw.dto.Selectable;
import co.com.binariasystems.fmw.entity.annot.CRUDViewConfig;
import co.com.binariasystems.fmw.entity.annot.Column;
import co.com.binariasystems.fmw.entity.annot.Entity;
import co.com.binariasystems.fmw.entity.annot.Ignore;
import co.com.binariasystems.fmw.entity.annot.Key;
import co.com.binariasystems.fmw.entity.annot.Relation;
import co.com.binariasystems.fmw.entity.annot.SearcherConfig;
import co.com.binariasystems.fmw.entity.annot.ViewFieldConfig;
import co.com.binariasystems.fmw.entity.cfg.EntityConfigUIControl;
import co.com.binariasystems.fmw.entity.cfg.PKGenerationStrategy;
import co.com.binariasystems.fmw.util.ObjectUtils.UpperTransform;
import co.com.binariasystems.orion.model.constants.Constants;

@Entity(table=Constants.ORION_DBSCHEMA+"."+"SEGT_ROLES",pkGenerationStrategy=PKGenerationStrategy.IDENTITY)
@CRUDViewConfig(searcherConfig=@SearcherConfig(descriptionFields="name"))
public class RoleDTO implements Serializable, Selectable {
	@Key(column="ID_ROL")
	private Integer rolId;
	@ViewFieldConfig(uiControl=EntityConfigUIControl.COMBOBOX)
	@Relation(column="ID_APLICACION")
    private ApplicationDTO application;
    @UpperTransform
    @Column(name="NOMBRE")
    private String name;
    @UpperTransform
    @Column(name="DESCRIPCION")
    private String description;
    @Ignore
    private boolean selected;
    
	/**
	 * @return the rolId
	 */
	public Integer getRolId() {
		return rolId;
	}
	/**
	 * @param rolId the rolId to set
	 */
	public void setRolId(Integer rolId) {
		this.rolId = rolId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the application
	 */
	public ApplicationDTO getApplication() {
		return application;
	}
	/**
	 * @param application the application to set
	 */
	public void setApplication(ApplicationDTO application) {
		this.application = application;
	}
	
	/**
	 * @return the selected
	 */
	public boolean isSelected() {
		return selected;
	}
	/**
	 * @param selected the selected to set
	 */
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((application == null) ? 0 : application.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RoleDTO other = (RoleDTO) obj;
		if (application == null) {
			if (other.application != null)
				return false;
		} else if (!application.equals(other.application))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
    
}
