package wuliu.centrin.com.gp.entity;

import java.io.Serializable;
import java.lang.reflect.Field;

/**
 * Created by lile on 2018/6/4.
 */

public class UserEntity implements Serializable {

    public String ErrorBuffer;
    public int ErrorCode;
    public RetMess RetMess;

    public class RetMess implements Serializable {
        public String YLHQMC;
        public String YLKFBH;
        public String MRHQ;
        public String PSKFMC;
        public String MRKFBH;
        public String QSHQ;
        public String MRHQMC;
        public String DbVersion;
        public String Version;
        public String THKFMC;
        public String PSHQMC;
        public String SystemName;
        public String THHQ;
        public String PSKFBH;
        public String MRKFMC;
        public boolean IfSelectXJPCH;
        public String THKFBH;
        public int Icdev;
        public String PSHQ;
        public String QSHQMC;
        public String QSKFBH;
        public boolean boCallScan;
        public String SystemNO;
        public String MFJCYWLX;
        public String YLKFMC;
        public String YLHQ;
        public String THHQMC;
        public String ReportHead;
        public String QSKFMC;
        public UserInfo UserInfo;

        public class UserInfo implements Serializable {
            public String TypeID;
            public String KFBH;
            public String DQDDM;
            public String PY;
            public String RoleID;
            public String KFMC;
            public String RetAll;
            public String UserID;
            public String DHFSQX;
            public String DepartmentID;
            public String DtmLogout;
            public int FLJB;
            public String UserName;
            public String StockName;
            public String IP;
            public String UserPassword;
            public String DtmLogin;
            public String HSDWBH;
            public String HQBH;
            public String StockID;
            public String DepartmentName;
            public String HSDWMC;
            public String ComputeName;
            public String SJBH;
            public String HQMC;
            public String DQDDH;

            public void setTypeID(String TypeID) {
                this.TypeID = TypeID;
            }

            public String getTypeID() {
                return this.TypeID;
            }

            public void setKFBH(String KFBH) {
                this.KFBH = KFBH;
            }

            public String getKFBH() {
                return this.KFBH;
            }

            public void setDQDDM(String DQDDM) {
                this.DQDDM = DQDDM;
            }

            public String getDQDDM() {
                return this.DQDDM;
            }

            public void setPY(String PY) {
                this.PY = PY;
            }

            public String getPY() {
                return this.PY;
            }

            public void setRoleID(String RoleID) {
                this.RoleID = RoleID;
            }

            public String getRoleID() {
                return this.RoleID;
            }

            public void setKFMC(String KFMC) {
                this.KFMC = KFMC;
            }

            public String getKFMC() {
                return this.KFMC;
            }

            public void setRetAll(String RetAll) {
                this.RetAll = RetAll;
            }

            public String getRetAll() {
                return this.RetAll;
            }

            public void setUserID(String UserID) {
                this.UserID = UserID;
            }

            public String getUserID() {
                return this.UserID;
            }

            public void setDHFSQX(String DHFSQX) {
                this.DHFSQX = DHFSQX;
            }

            public String getDHFSQX() {
                return this.DHFSQX;
            }

            public void setDepartmentID(String DepartmentID) {
                this.DepartmentID = DepartmentID;
            }

            public String getDepartmentID() {
                return this.DepartmentID;
            }

            public void setDtmLogout(String DtmLogout) {
                this.DtmLogout = DtmLogout;
            }

            public String getDtmLogout() {
                return this.DtmLogout;
            }

            public void setFLJB(int FLJB) {
                this.FLJB = FLJB;
            }

            public int getFLJB() {
                return this.FLJB;
            }

            public void setUserName(String UserName) {
                this.UserName = UserName;
            }

            public String getUserName() {
                return this.UserName;
            }

            public void setStockName(String StockName) {
                this.StockName = StockName;
            }

            public String getStockName() {
                return this.StockName;
            }

            public void setIP(String IP) {
                this.IP = IP;
            }

            public String getIP() {
                return this.IP;
            }

            public void setUserPassword(String UserPassword) {
                this.UserPassword = UserPassword;
            }

            public String getUserPassword() {
                return this.UserPassword;
            }

            public void setDtmLogin(String DtmLogin) {
                this.DtmLogin = DtmLogin;
            }

            public String getDtmLogin() {
                return this.DtmLogin;
            }

            public void setHSDWBH(String HSDWBH) {
                this.HSDWBH = HSDWBH;
            }

            public String getHSDWBH() {
                return this.HSDWBH;
            }

            public void setHQBH(String HQBH) {
                this.HQBH = HQBH;
            }

            public String getHQBH() {
                return this.HQBH;
            }

            public void setStockID(String StockID) {
                this.StockID = StockID;
            }

            public String getStockID() {
                return this.StockID;
            }

            public void setDepartmentName(String DepartmentName) {
                this.DepartmentName = DepartmentName;
            }

            public String getDepartmentName() {
                return this.DepartmentName;
            }

            public void setHSDWMC(String HSDWMC) {
                this.HSDWMC = HSDWMC;
            }

            public String getHSDWMC() {
                return this.HSDWMC;
            }

            public void setComputeName(String ComputeName) {
                this.ComputeName = ComputeName;
            }

            public String getComputeName() {
                return this.ComputeName;
            }

            public void setSJBH(String SJBH) {
                this.SJBH = SJBH;
            }

            public String getSJBH() {
                return this.SJBH;
            }

            public void setHQMC(String HQMC) {
                this.HQMC = HQMC;
            }

            public String getHQMC() {
                return this.HQMC;
            }

            public void setDQDDH(String DQDDH) {
                this.DQDDH = DQDDH;
            }

            public String getDQDDH() {
                return this.DQDDH;
            }

            public String toString() {
                String s = "";
                Field[] arr = this.getClass().getFields();
                for (Field f : getClass().getFields()) {
                    try {
                        s += f.getName() + "=" + f.get(this) + "\n,";
                    } catch (Exception e) {
                    }
                }
                return getClass().getSimpleName() + "[" + (arr.length == 0 ? s : s.substring(0, s.length() - 1)) + "]";
            }
        }

        public void setYLHQMC(String YLHQMC) {
            this.YLHQMC = YLHQMC;
        }

        public String getYLHQMC() {
            return this.YLHQMC;
        }

        public void setYLKFBH(String YLKFBH) {
            this.YLKFBH = YLKFBH;
        }

        public String getYLKFBH() {
            return this.YLKFBH;
        }

        public void setMRHQ(String MRHQ) {
            this.MRHQ = MRHQ;
        }

        public String getMRHQ() {
            return this.MRHQ;
        }

        public void setPSKFMC(String PSKFMC) {
            this.PSKFMC = PSKFMC;
        }

        public String getPSKFMC() {
            return this.PSKFMC;
        }

        public void setMRKFBH(String MRKFBH) {
            this.MRKFBH = MRKFBH;
        }

        public String getMRKFBH() {
            return this.MRKFBH;
        }

        public void setQSHQ(String QSHQ) {
            this.QSHQ = QSHQ;
        }

        public String getQSHQ() {
            return this.QSHQ;
        }

        public void setMRHQMC(String MRHQMC) {
            this.MRHQMC = MRHQMC;
        }

        public String getMRHQMC() {
            return this.MRHQMC;
        }

        public void setDbVersion(String DbVersion) {
            this.DbVersion = DbVersion;
        }

        public String getDbVersion() {
            return this.DbVersion;
        }

        public void setVersion(String Version) {
            this.Version = Version;
        }

        public String getVersion() {
            return this.Version;
        }

        public void setTHKFMC(String THKFMC) {
            this.THKFMC = THKFMC;
        }

        public String getTHKFMC() {
            return this.THKFMC;
        }

        public void setPSHQMC(String PSHQMC) {
            this.PSHQMC = PSHQMC;
        }

        public String getPSHQMC() {
            return this.PSHQMC;
        }

        public void setSystemName(String SystemName) {
            this.SystemName = SystemName;
        }

        public String getSystemName() {
            return this.SystemName;
        }

        public void setTHHQ(String THHQ) {
            this.THHQ = THHQ;
        }

        public String getTHHQ() {
            return this.THHQ;
        }

        public void setPSKFBH(String PSKFBH) {
            this.PSKFBH = PSKFBH;
        }

        public String getPSKFBH() {
            return this.PSKFBH;
        }

        public void setMRKFMC(String MRKFMC) {
            this.MRKFMC = MRKFMC;
        }

        public String getMRKFMC() {
            return this.MRKFMC;
        }

        public void setIfSelectXJPCH(boolean IfSelectXJPCH) {
            this.IfSelectXJPCH = IfSelectXJPCH;
        }

        public boolean getIfSelectXJPCH() {
            return this.IfSelectXJPCH;
        }

        public void setTHKFBH(String THKFBH) {
            this.THKFBH = THKFBH;
        }

        public String getTHKFBH() {
            return this.THKFBH;
        }

        public void setIcdev(int Icdev) {
            this.Icdev = Icdev;
        }

        public int getIcdev() {
            return this.Icdev;
        }

        public void setPSHQ(String PSHQ) {
            this.PSHQ = PSHQ;
        }

        public String getPSHQ() {
            return this.PSHQ;
        }

        public void setQSHQMC(String QSHQMC) {
            this.QSHQMC = QSHQMC;
        }

        public String getQSHQMC() {
            return this.QSHQMC;
        }

        public void setQSKFBH(String QSKFBH) {
            this.QSKFBH = QSKFBH;
        }

        public String getQSKFBH() {
            return this.QSKFBH;
        }

        public void setBoCallScan(boolean boCallScan) {
            this.boCallScan = boCallScan;
        }

        public boolean getBoCallScan() {
            return this.boCallScan;
        }

        public void setSystemNO(String SystemNO) {
            this.SystemNO = SystemNO;
        }

        public String getSystemNO() {
            return this.SystemNO;
        }

        public void setMFJCYWLX(String MFJCYWLX) {
            this.MFJCYWLX = MFJCYWLX;
        }

        public String getMFJCYWLX() {
            return this.MFJCYWLX;
        }

        public void setYLKFMC(String YLKFMC) {
            this.YLKFMC = YLKFMC;
        }

        public String getYLKFMC() {
            return this.YLKFMC;
        }

        public void setYLHQ(String YLHQ) {
            this.YLHQ = YLHQ;
        }

        public String getYLHQ() {
            return this.YLHQ;
        }

        public void setTHHQMC(String THHQMC) {
            this.THHQMC = THHQMC;
        }

        public String getTHHQMC() {
            return this.THHQMC;
        }

        public void setReportHead(String ReportHead) {
            this.ReportHead = ReportHead;
        }

        public String getReportHead() {
            return this.ReportHead;
        }

        public void setQSKFMC(String QSKFMC) {
            this.QSKFMC = QSKFMC;
        }

        public String getQSKFMC() {
            return this.QSKFMC;
        }

        public String toString() {
            String s = "";
            Field[] arr = this.getClass().getFields();
            for (Field f : getClass().getFields()) {
                try {
                    s += f.getName() + "=" + f.get(this) + "\n,";
                } catch (Exception e) {
                }
            }
            return getClass().getSimpleName() + "[" + (arr.length == 0 ? s : s.substring(0, s.length() - 1)) + "]";
        }
    }

    public void setErrorBuffer(String ErrorBuffer) {
        this.ErrorBuffer = ErrorBuffer;
    }

    public String getErrorBuffer() {
        return this.ErrorBuffer;
    }

    public void setErrorCode(int ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    public int getErrorCode() {
        return this.ErrorCode;
    }

    public String toString() {
        String s = "";
        Field[] arr = this.getClass().getFields();
        for (Field f : getClass().getFields()) {
            try {
                s += f.getName() + "=" + f.get(this) + "\n,";
            } catch (Exception e) {
            }
        }
        return getClass().getSimpleName() + "[" + (arr.length == 0 ? s : s.substring(0, s.length() - 1)) + "]";
    }
}
