package gil.portfolio.menu.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PtSvcEntAmnId implements Serializable {
    private static final long serialVersionUID = 7504230429187070290L;
    @Column(name = "NA_TRPL_C", nullable = false, length = 13)
    private String naTrplC;

    @Column(name = "SVC_ID", nullable = false, length = 2)
    private String svcId;

    public String getNaTrplC() {
        return naTrplC;
    }

    public void setNaTrplC(String naTrplC) {
        this.naTrplC = naTrplC;
    }

    public String getSvcId() {
        return svcId;
    }

    public void setSvcId(String svcId) {
        this.svcId = svcId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PtSvcEntAmnId entity = (PtSvcEntAmnId) o;
        return Objects.equals(this.svcId, entity.svcId) &&
                Objects.equals(this.naTrplC, entity.naTrplC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(svcId, naTrplC);
    }

}