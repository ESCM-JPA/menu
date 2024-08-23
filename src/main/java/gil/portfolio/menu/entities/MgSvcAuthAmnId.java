package gil.portfolio.menu.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MgSvcAuthAmnId implements Serializable {
    private static final long serialVersionUID = -6949114493245907163L;
    @Column(name = "SVC_ID", nullable = false, length = 2)
    private String svcId;

    @Column(name = "MENU_ID", nullable = false, length = 8)
    private String menuId;

    public String getSvcId() {
        return svcId;
    }

    public void setSvcId(String svcId) {
        this.svcId = svcId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MgSvcAuthAmnId entity = (MgSvcAuthAmnId) o;
        return Objects.equals(this.svcId, entity.svcId) &&
                Objects.equals(this.menuId, entity.menuId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(svcId, menuId);
    }

}