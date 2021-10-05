package aula;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Periodo {

    @Column(name = "CD_PVVDT_PRC_VND")
    private String CD_PVVDT_PRC_VND;

    @Column(name = "CD_PVVDT_DOC_PRC")
    private String CD_PVVDT_DOC_PRC;

    @Column(name = "CD_LPVVDT_LOT_PRC")
    private String CD_LPVVDT_LOT_PRC;

    @Column(name = "CD_MLVVDT_MCR_WMS")
    private String CD_MLVVDT_MCR_WMS;

    @Id
    @Column(name = "CD_MCR")
    private String CD_MCR;

    @Column(name = "DS_MCR")
    private String DS_MCR;

    @Column(name = "VR_MLVVDT_MIN_VND")
    private String VR_MLVVDT_MIN_VND;

    @Column(name = "VR_MLVVDT_CUS_MCR")
    private String VR_MLVVDT_CUS_MCR;

    public String getCD_PVVDT_PRC_VND() {
        return CD_PVVDT_PRC_VND;
    }

    public void setCD_PVVDT_PRC_VND(String CD_PVVDT_PRC_VND) {
        this.CD_PVVDT_PRC_VND = CD_PVVDT_PRC_VND;
    }

    public String getCD_PVVDT_DOC_PRC() {
        return CD_PVVDT_DOC_PRC;
    }

    public void setCD_PVVDT_DOC_PRC(String CD_PVVDT_DOC_PRC) {
        this.CD_PVVDT_DOC_PRC = CD_PVVDT_DOC_PRC;
    }

    public String getCD_LPVVDT_LOT_PRC() {
        return CD_LPVVDT_LOT_PRC;
    }

    public void setCD_LPVVDT_LOT_PRC(String CD_LPVVDT_LOT_PRC) {
        this.CD_LPVVDT_LOT_PRC = CD_LPVVDT_LOT_PRC;
    }

    public String getCD_MLVVDT_MCR_WMS() {
        return CD_MLVVDT_MCR_WMS;
    }

    public void setCD_MLVVDT_MCR_WMS(String CD_MLVVDT_MCR_WMS) {
        this.CD_MLVVDT_MCR_WMS = CD_MLVVDT_MCR_WMS;
    }

    public String getCD_MCR() {
        return CD_MCR;
    }

    public void setCD_MCR(String CD_MCR) {
        this.CD_MCR = CD_MCR;
    }

    public String getDS_MCR() {
        return DS_MCR;
    }

    public void setDS_MCR(String DS_MCR) {
        this.DS_MCR = DS_MCR;
    }

    public String getVR_MLVVDT_MIN_VND() {
        return VR_MLVVDT_MIN_VND;
    }

    public void setVR_MLVVDT_MIN_VND(String VR_MLVVDT_MIN_VND) {
        this.VR_MLVVDT_MIN_VND = VR_MLVVDT_MIN_VND;
    }

    public String getVR_MLVVDT_CUS_MCR() {
        return VR_MLVVDT_CUS_MCR;
    }

    public void setVR_MLVVDT_CUS_MCR(String VR_MLVVDT_CUS_MCR) {
        this.VR_MLVVDT_CUS_MCR = VR_MLVVDT_CUS_MCR;
    }

    @Override
    public String toString() {
        return "Period{" +
                "CD_PVVDT_PRC_VND='" + CD_PVVDT_PRC_VND + '\'' +
                ", CD_PVVDT_DOC_PRC='" + CD_PVVDT_DOC_PRC + '\'' +
                ", CD_LPVVDT_LOT_PRC='" + CD_LPVVDT_LOT_PRC + '\'' +
                ", CD_MLVVDT_MCR_WMS='" + CD_MLVVDT_MCR_WMS + '\'' +
                ", CD_MCR='" + CD_MCR + '\'' +
                ", DS_MCR='" + DS_MCR + '\'' +
                ", VR_MLVVDT_MIN_VND='" + VR_MLVVDT_MIN_VND + '\'' +
                ", VR_MLVVDT_CUS_MCR='" + VR_MLVVDT_CUS_MCR + '\'' +
                '}';
    }

    public String toCsv() {
        return CD_PVVDT_PRC_VND + ';' +
                CD_PVVDT_DOC_PRC + ';' +
                CD_LPVVDT_LOT_PRC + ';' +
                CD_MLVVDT_MCR_WMS + ';' +
                CD_MCR + ';' +
                DS_MCR + ';' +
                VR_MLVVDT_MIN_VND + ';' +
                VR_MLVVDT_CUS_MCR;
    }
}
