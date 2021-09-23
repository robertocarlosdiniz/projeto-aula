package aula;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MCR")
public class MCR {

    @Id
    @Column(name = "CD_MCR")
    private String CD_MCR;

    @Column(name = "CD_SETMCR")
    private String CD_SETMCR;

    @Column(name = "CD_ESPMCR")
    private String CD_ESPMCR;

    @Column(name = "CD_MRCMCR")
    private String CD_MRCMCR;

    @Column(name = "CD_CLAMCR")
    private String CD_CLAMCR;

    @Column(name = "CD_MCR_LIN")
    private String CD_MCR_LIN;

    @Column(name = "CD_TSMCR")
    private String CD_TSMCR;

    @Column(name = "CD_MCR_ORD_EMI")
    private String CD_MCR_ORD_EMI;

    @Column(name = "DS_MCR")
    private String DS_MCR;

    @Column(name = "VR_MCR_RBT_ATU")
    private String VR_MCR_RBT_ATU;

    @Column(name = "VR_MCR_RBT_PXM")
    private String VR_MCR_RBT_PXM;

    @Column(name = "VR_MCR_RBT_RTO")
    private String VR_MCR_RBT_RTO;

    @Column(name = "VR_MCR_SGT_ATU")
    private String VR_MCR_SGT_ATU;

    @Column(name = "VR_MCR_SGT_PXM")
    private String VR_MCR_SGT_PXM;

    @Column(name = "VR_MCR_SGT_RTO")
    private String VR_MCR_SGT_RTO;

    @Column(name = "VR_MCR_VND_EPL")
    private String VR_MCR_VND_EPL;

    @Column(name = "ST_MCR_ORI")
    private String ST_MCR_ORI;

    @Column(name = "ST_MCR_UND_VND")
    private String ST_MCR_UND_VND;

    @Column(name = "VR_MCR_CPR_FNE")
    private String VR_MCR_CPR_FNE;

    @Column(name = "TX_MCR_ABT")
    private String TX_MCR_ABT;

    @Column(name = "TX_MCR_IPI")
    private String TX_MCR_IPI;

    @Column(name = "TX_MCR_PPG")
    private String TX_MCR_PPG;

    @Column(name = "CD_CNDPGT")
    private String CD_CNDPGT;

    @Column(name = "VR_MCR_ULT_RCB")
    private String VR_MCR_ULT_RCB;

    @Column(name = "DT_MCR_ULT_RCB")
    private String DT_MCR_ULT_RCB;

    @Column(name = "VR_MCR_CUS_MED")
    private String VR_MCR_CUS_MED;

    @Column(name = "DT_MCR_ICL")
    private String DT_MCR_ICL;

    @Column(name = "CD_EMPGCB_FUN_ALT")
    private String CD_EMPGCB_FUN_ALT;

    @Column(name = "CD_FUN_ALT")
    private String CD_FUN_ALT;

    @Column(name = "DT_MCR_ULT_ALT")
    private String DT_MCR_ULT_ALT;

    @Column(name = "CD_MCR_FCH_TEC")
    private String CD_MCR_FCH_TEC;

    @Column(name = "ST_MCR_DTB_ATM")
    private String ST_MCR_DTB_ATM;

    @Column(name = "QT_MCR_CBG")
    private String QT_MCR_CBG;

    @Column(name = "QT_MCR_MAX_REQ")
    private String QT_MCR_MAX_REQ;

    @Column(name = "DT_MCR_ULT_DTB")
    private String DT_MCR_ULT_DTB;

    @Column(name = "DT_MCR_MNT_CBG")
    private String DT_MCR_MNT_CBG;

    @Column(name = "CD_CFIPI_RED")
    private String CD_CFIPI_RED;

    @Column(name = "QT_MCR_ATR")
    private String QT_MCR_ATR;

    @Column(name = "QT_MCR_LGU")
    private String QT_MCR_LGU;

    @Column(name = "QT_MCR_CMT")
    private String QT_MCR_CMT;

    @Column(name = "ST_MCR_CSC")
    private String ST_MCR_CSC;

    @Column(name = "ST_MCR_ETG_DPO")
    private String ST_MCR_ETG_DPO;

    @Column(name = "CD_EMPGCB_FNE_PEC")
    private String CD_EMPGCB_FNE_PEC;

    @Column(name = "CD_FNEMCR_FNE_PEC")
    private String CD_FNEMCR_FNE_PEC;

    @Column(name = "ST_MCR_VND_PRO")
    private String ST_MCR_VND_PRO;

    @Column(name = "ST_MCR_DIG_SIS")
    private String ST_MCR_DIG_SIS;

    @Column(name = "DT_MCR_PDT")
    private String DT_MCR_PDT;

    @Column(name = "ST_MCR_MTG")
    private String ST_MCR_MTG;

    @Column(name = "ST_MCR_GLE")
    private String ST_MCR_GLE;

    @Column(name = "ST_MCR_TBT_ESP")
    private String ST_MCR_TBT_ESP;

    @Column(name = "ST_MCR_TEC")
    private String ST_MCR_TEC;

    @Column(name = "CD_RTCMCR")
    private String CD_RTCMCR;

    @Column(name = "ST_MCR_BRD")
    private String ST_MCR_BRD;

    @Column(name = "CD_TGMCR")
    private String CD_TGMCR;

    @Column(name = "CD_MODMCR")
    private String CD_MODMCR;

    @Column(name = "DT_MCR_REU")
    private String DT_MCR_REU;

    @Column(name = "QT_MCR_SER")
    private String QT_MCR_SER;

    @Column(name = "QT_MCR_LIN")
    private String QT_MCR_LIN;

    @Column(name = "QT_MCR_CHP")
    private String QT_MCR_CHP;

    @Column(name = "ST_MCR_FNC_TCO")
    private String ST_MCR_FNC_TCO;

    @Column(name = "ST_MCR_GES")
    private String ST_MCR_GES;

    @Column(name = "QT_MCR_DIA_PDT")
    private String QT_MCR_DIA_PDT;

    @Column(name = "CD_OPRCEL")
    private String CD_OPRCEL;

    @Column(name = "CD_RGICEL")
    private String CD_RGICEL;

    @Column(name = "ST_MCR_REQ_PRO")
    private String ST_MCR_REQ_PRO;

    @Column(name = "ST_MCR_MID")
    private String ST_MCR_MID;

    @Column(name = "QT_MCR_PSO")
    private String QT_MCR_PSO;

    @Column(name = "ST_MCR_LOJ_VRT")
    private String ST_MCR_LOJ_VRT;

    @Column(name = "ST_MCR_CVT")
    private String ST_MCR_CVT;

    @Column(name = "TX_MCR_DIF")
    private String TX_MCR_DIF;

    @Column(name = "QT_MCR_MTD")
    private String QT_MCR_MTD;

    @Column(name = "ST_MCR_CTZ")
    private String ST_MCR_CTZ;

    @Column(name = "QT_MCR_VLM_EBG")
    private String QT_MCR_VLM_EBG;

    @Column(name = "ST_MCR_ECL_ITR")
    private String ST_MCR_ECL_ITR;

    @Column(name = "CD_MCR_FAB")
    private String CD_MCR_FAB;

    @Column(name = "QT_MCR_PSO_LIQ")
    private String QT_MCR_PSO_LIQ;

    @Column(name = "QT_MCR_BLO_AMZ")
    private String QT_MCR_BLO_AMZ;

    @Column(name = "CD_MCR_CCT_CEL")
    private String CD_MCR_CCT_CEL;

    @Column(name = "CD_TCMCR")
    private String CD_TCMCR;

    @Column(name = "CD_ITCMCR")
    private String CD_ITCMCR;

    @Column(name = "ST_MCR_ABC")
    private String ST_MCR_ABC;

    @Column(name = "QT_MCR_MUL_VND")
    private String QT_MCR_MUL_VND;

    @Column(name = "ST_MCR_SAT")
    private String ST_MCR_SAT;

    @Column(name = "ST_MCR_VIC")
    private String ST_MCR_VIC;

    @Column(name = "CD_MCR_EAN")
    private String CD_MCR_EAN;

    @Column(name = "ST_MCR_PEG_LEV")
    private String ST_MCR_PEG_LEV;

    @Column(name = "ST_MCR_DTB_STM")
    private String ST_MCR_DTB_STM;

    @Column(name = "QT_MCR_TMP_MTG")
    private String QT_MCR_TMP_MTG;

    @Column(name = "CD_MCDORI")
    private String CD_MCDORI;

    @Column(name = "ST_MCR_TIP_ETG")
    private String ST_MCR_TIP_ETG;

    @Column(name = "ST_MCR_TIP_FNE")
    private String ST_MCR_TIP_FNE;

    @Column(name = "ST_MCR_PPB")
    private String ST_MCR_PPB;

    @Column(name = "DS_MCR_PPB_PRT")
    private String DS_MCR_PPB_PRT;

    @Column(name = "ST_MCR_CAD_FIS")
    private String ST_MCR_CAD_FIS;

    @Column(name = "ST_MCR_BEM")
    private String ST_MCR_BEM;

    @Column(name = "CD_MCDORI_PDT")
    private String CD_MCDORI_PDT;

    @Column(name = "ST_MCR_VND_CNJ")
    private String ST_MCR_VND_CNJ;

    @Column(name = "ST_MCR_DMG")
    private String ST_MCR_DMG;

    @Column(name = "ST_MCR_ELG_MBL")
    private String ST_MCR_ELG_MBL;

    @Column(name = "CD_MCR_EAN_CXA")
    private String CD_MCR_EAN_CXA;

    @Column(name = "ST_MCR_SIN")
    private String ST_MCR_SIN;

    @Column(name = "ST_MCR_SVV")
    private String ST_MCR_SVV;

    @Column(name = "ST_MCR_SCN")
    private String ST_MCR_SCN;

    @Column(name = "ST_MCR_SMV")
    private String ST_MCR_SMV;

    @Column(name = "ST_MCR_ATZ_PMT")
    private String ST_MCR_ATZ_PMT;

    @Column(name = "ST_MCR_CPR_PRO")
    private String ST_MCR_CPR_PRO;

    @Column(name = "CD_MCR_CIT")
    private String CD_MCR_CIT;

    @Column(name = "ST_MCR_DTB_CXA")
    private String ST_MCR_DTB_CXA;

    @Column(name = "CD_MDLMCR")
    private String CD_MDLMCR;

    @Column(name = "CD_TIPMCR")
    private String CD_TIPMCR;

    @Column(name = "CD_MCR_EAN_OPR")
    private String CD_MCR_EAN_OPR;

    @Column(name = "ST_MCR_UTZ_ATC")
    private String ST_MCR_UTZ_ATC;

    @Column(name = "ST_MCR_SON")
    private String ST_MCR_SON;

    @Column(name = "CD_MCR_TIP_PRD")
    private String CD_MCR_TIP_PRD;

    @Column(name = "CD_MCR_FNE")
    private String CD_MCR_FNE;

    @Column(name = "CD_SUBESP")
    private String CD_SUBESP;

    @Column(name = "QT_MCR_ATR_MTD")
    private String QT_MCR_ATR_MTD;

    @Column(name = "QT_MCR_LGU_MTD")
    private String QT_MCR_LGU_MTD;

    @Column(name = "QT_MCR_CMT_MTD")
    private String QT_MCR_CMT_MTD;

    @Column(name = "CD_MRCMCR_CMC")
    private String CD_MRCMCR_CMC;

    @Column(name = "ST_MCR_BLQ_VND")
    private String ST_MCR_BLQ_VND;

    @Column(name = "ST_MCR_PRE_LAN")
    private String ST_MCR_PRE_LAN;

    @Column(name = "QT_MCR_CXA_SUP")
    private String QT_MCR_CXA_SUP;

    @Column(name = "ST_MCR_ENV_NGD")
    private String ST_MCR_ENV_NGD;

    @Column(name = "ST_MCR_SUS")
    private String ST_MCR_SUS;

    @Override
    public String toString() {
        return "MCR{" +
                "CD_MCR='" + CD_MCR + '\'' +
                ", CD_SETMCR='" + CD_SETMCR + '\'' +
                ", CD_ESPMCR='" + CD_ESPMCR + '\'' +
                ", CD_MRCMCR='" + CD_MRCMCR + '\'' +
                ", CD_CLAMCR='" + CD_CLAMCR + '\'' +
                ", CD_MCR_LIN='" + CD_MCR_LIN + '\'' +
                ", CD_TSMCR='" + CD_TSMCR + '\'' +
                ", CD_MCR_ORD_EMI='" + CD_MCR_ORD_EMI + '\'' +
                ", DS_MCR='" + DS_MCR + '\'' +
                ", VR_MCR_RBT_ATU='" + VR_MCR_RBT_ATU + '\'' +
                ", VR_MCR_RBT_PXM='" + VR_MCR_RBT_PXM + '\'' +
                ", VR_MCR_RBT_RTO='" + VR_MCR_RBT_RTO + '\'' +
                ", VR_MCR_SGT_ATU='" + VR_MCR_SGT_ATU + '\'' +
                ", VR_MCR_SGT_PXM='" + VR_MCR_SGT_PXM + '\'' +
                ", VR_MCR_SGT_RTO='" + VR_MCR_SGT_RTO + '\'' +
                ", VR_MCR_VND_EPL='" + VR_MCR_VND_EPL + '\'' +
                ", ST_MCR_ORI='" + ST_MCR_ORI + '\'' +
                ", ST_MCR_UND_VND='" + ST_MCR_UND_VND + '\'' +
                ", VR_MCR_CPR_FNE='" + VR_MCR_CPR_FNE + '\'' +
                ", TX_MCR_ABT='" + TX_MCR_ABT + '\'' +
                ", TX_MCR_IPI='" + TX_MCR_IPI + '\'' +
                ", TX_MCR_PPG='" + TX_MCR_PPG + '\'' +
                ", CD_CNDPGT='" + CD_CNDPGT + '\'' +
                ", VR_MCR_ULT_RCB='" + VR_MCR_ULT_RCB + '\'' +
                ", DT_MCR_ULT_RCB='" + DT_MCR_ULT_RCB + '\'' +
                ", VR_MCR_CUS_MED='" + VR_MCR_CUS_MED + '\'' +
                ", DT_MCR_ICL='" + DT_MCR_ICL + '\'' +
                ", CD_EMPGCB_FUN_ALT='" + CD_EMPGCB_FUN_ALT + '\'' +
                ", CD_FUN_ALT='" + CD_FUN_ALT + '\'' +
                ", DT_MCR_ULT_ALT='" + DT_MCR_ULT_ALT + '\'' +
                ", CD_MCR_FCH_TEC='" + CD_MCR_FCH_TEC + '\'' +
                ", ST_MCR_DTB_ATM='" + ST_MCR_DTB_ATM + '\'' +
                ", QT_MCR_CBG='" + QT_MCR_CBG + '\'' +
                ", QT_MCR_MAX_REQ='" + QT_MCR_MAX_REQ + '\'' +
                ", DT_MCR_ULT_DTB='" + DT_MCR_ULT_DTB + '\'' +
                ", DT_MCR_MNT_CBG='" + DT_MCR_MNT_CBG + '\'' +
                ", CD_CFIPI_RED='" + CD_CFIPI_RED + '\'' +
                ", QT_MCR_ATR='" + QT_MCR_ATR + '\'' +
                ", QT_MCR_LGU='" + QT_MCR_LGU + '\'' +
                ", QT_MCR_CMT='" + QT_MCR_CMT + '\'' +
                ", ST_MCR_CSC='" + ST_MCR_CSC + '\'' +
                ", ST_MCR_ETG_DPO='" + ST_MCR_ETG_DPO + '\'' +
                ", CD_EMPGCB_FNE_PEC='" + CD_EMPGCB_FNE_PEC + '\'' +
                ", CD_FNEMCR_FNE_PEC='" + CD_FNEMCR_FNE_PEC + '\'' +
                ", ST_MCR_VND_PRO='" + ST_MCR_VND_PRO + '\'' +
                ", ST_MCR_DIG_SIS='" + ST_MCR_DIG_SIS + '\'' +
                ", DT_MCR_PDT='" + DT_MCR_PDT + '\'' +
                ", ST_MCR_MTG='" + ST_MCR_MTG + '\'' +
                ", ST_MCR_GLE='" + ST_MCR_GLE + '\'' +
                ", ST_MCR_TBT_ESP='" + ST_MCR_TBT_ESP + '\'' +
                ", ST_MCR_TEC='" + ST_MCR_TEC + '\'' +
                ", CD_RTCMCR='" + CD_RTCMCR + '\'' +
                ", ST_MCR_BRD='" + ST_MCR_BRD + '\'' +
                ", CD_TGMCR='" + CD_TGMCR + '\'' +
                ", CD_MODMCR='" + CD_MODMCR + '\'' +
                ", DT_MCR_REU='" + DT_MCR_REU + '\'' +
                ", QT_MCR_SER='" + QT_MCR_SER + '\'' +
                ", QT_MCR_LIN='" + QT_MCR_LIN + '\'' +
                ", QT_MCR_CHP='" + QT_MCR_CHP + '\'' +
                ", ST_MCR_FNC_TCO='" + ST_MCR_FNC_TCO + '\'' +
                ", ST_MCR_GES='" + ST_MCR_GES + '\'' +
                ", QT_MCR_DIA_PDT='" + QT_MCR_DIA_PDT + '\'' +
                ", CD_OPRCEL='" + CD_OPRCEL + '\'' +
                ", CD_RGICEL='" + CD_RGICEL + '\'' +
                ", ST_MCR_REQ_PRO='" + ST_MCR_REQ_PRO + '\'' +
                ", ST_MCR_MID='" + ST_MCR_MID + '\'' +
                ", QT_MCR_PSO='" + QT_MCR_PSO + '\'' +
                ", ST_MCR_LOJ_VRT='" + ST_MCR_LOJ_VRT + '\'' +
                ", ST_MCR_CVT='" + ST_MCR_CVT + '\'' +
                ", TX_MCR_DIF='" + TX_MCR_DIF + '\'' +
                ", QT_MCR_MTD='" + QT_MCR_MTD + '\'' +
                ", ST_MCR_CTZ='" + ST_MCR_CTZ + '\'' +
                ", QT_MCR_VLM_EBG='" + QT_MCR_VLM_EBG + '\'' +
                ", ST_MCR_ECL_ITR='" + ST_MCR_ECL_ITR + '\'' +
                ", CD_MCR_FAB='" + CD_MCR_FAB + '\'' +
                ", QT_MCR_PSO_LIQ='" + QT_MCR_PSO_LIQ + '\'' +
                ", QT_MCR_BLO_AMZ='" + QT_MCR_BLO_AMZ + '\'' +
                ", CD_MCR_CCT_CEL='" + CD_MCR_CCT_CEL + '\'' +
                ", CD_TCMCR='" + CD_TCMCR + '\'' +
                ", CD_ITCMCR='" + CD_ITCMCR + '\'' +
                ", ST_MCR_ABC='" + ST_MCR_ABC + '\'' +
                ", QT_MCR_MUL_VND='" + QT_MCR_MUL_VND + '\'' +
                ", ST_MCR_SAT='" + ST_MCR_SAT + '\'' +
                ", ST_MCR_VIC='" + ST_MCR_VIC + '\'' +
                ", CD_MCR_EAN='" + CD_MCR_EAN + '\'' +
                ", ST_MCR_PEG_LEV='" + ST_MCR_PEG_LEV + '\'' +
                ", ST_MCR_DTB_STM='" + ST_MCR_DTB_STM + '\'' +
                ", QT_MCR_TMP_MTG='" + QT_MCR_TMP_MTG + '\'' +
                ", CD_MCDORI='" + CD_MCDORI + '\'' +
                ", ST_MCR_TIP_ETG='" + ST_MCR_TIP_ETG + '\'' +
                ", ST_MCR_TIP_FNE='" + ST_MCR_TIP_FNE + '\'' +
                ", ST_MCR_PPB='" + ST_MCR_PPB + '\'' +
                ", DS_MCR_PPB_PRT='" + DS_MCR_PPB_PRT + '\'' +
                ", ST_MCR_CAD_FIS='" + ST_MCR_CAD_FIS + '\'' +
                ", ST_MCR_BEM='" + ST_MCR_BEM + '\'' +
                ", CD_MCDORI_PDT='" + CD_MCDORI_PDT + '\'' +
                ", ST_MCR_VND_CNJ='" + ST_MCR_VND_CNJ + '\'' +
                ", ST_MCR_DMG='" + ST_MCR_DMG + '\'' +
                ", ST_MCR_ELG_MBL='" + ST_MCR_ELG_MBL + '\'' +
                ", CD_MCR_EAN_CXA='" + CD_MCR_EAN_CXA + '\'' +
                ", ST_MCR_SIN='" + ST_MCR_SIN + '\'' +
                ", ST_MCR_SVV='" + ST_MCR_SVV + '\'' +
                ", ST_MCR_SCN='" + ST_MCR_SCN + '\'' +
                ", ST_MCR_SMV='" + ST_MCR_SMV + '\'' +
                ", ST_MCR_ATZ_PMT='" + ST_MCR_ATZ_PMT + '\'' +
                ", ST_MCR_CPR_PRO='" + ST_MCR_CPR_PRO + '\'' +
                ", CD_MCR_CIT='" + CD_MCR_CIT + '\'' +
                ", ST_MCR_DTB_CXA='" + ST_MCR_DTB_CXA + '\'' +
                ", CD_MDLMCR='" + CD_MDLMCR + '\'' +
                ", CD_TIPMCR='" + CD_TIPMCR + '\'' +
                ", CD_MCR_EAN_OPR='" + CD_MCR_EAN_OPR + '\'' +
                ", ST_MCR_UTZ_ATC='" + ST_MCR_UTZ_ATC + '\'' +
                ", ST_MCR_SON='" + ST_MCR_SON + '\'' +
                ", CD_MCR_TIP_PRD='" + CD_MCR_TIP_PRD + '\'' +
                ", CD_MCR_FNE='" + CD_MCR_FNE + '\'' +
                ", CD_SUBESP='" + CD_SUBESP + '\'' +
                ", QT_MCR_ATR_MTD='" + QT_MCR_ATR_MTD + '\'' +
                ", QT_MCR_LGU_MTD='" + QT_MCR_LGU_MTD + '\'' +
                ", QT_MCR_CMT_MTD='" + QT_MCR_CMT_MTD + '\'' +
                ", CD_MRCMCR_CMC='" + CD_MRCMCR_CMC + '\'' +
                ", ST_MCR_BLQ_VND='" + ST_MCR_BLQ_VND + '\'' +
                ", ST_MCR_PRE_LAN='" + ST_MCR_PRE_LAN + '\'' +
                ", QT_MCR_CXA_SUP='" + QT_MCR_CXA_SUP + '\'' +
                ", ST_MCR_ENV_NGD='" + ST_MCR_ENV_NGD + '\'' +
                ", ST_MCR_SUS='" + ST_MCR_SUS + '\'' +
                "}\n";
    }
}
