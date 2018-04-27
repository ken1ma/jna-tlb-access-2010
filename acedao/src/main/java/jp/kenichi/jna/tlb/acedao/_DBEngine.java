
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000021-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000021-0000-0010-8000-00AA006D2EA4}")
public interface _DBEngine extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Properties", dispId = 0xa)
    Properties getProperties();
            
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Version", dispId = 0x60030000)
    String getVersion();
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "IniPath", dispId = 0x60030001)
    String getIniPath();
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "IniPath", dispId = 0x60030001)
    void setIniPath(String param0);
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DefaultUser", dispId = 0x60030003)
    void setDefaultUser(String param0);
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "DefaultPassword", dispId = 0x60030004)
    void setDefaultPassword(String param0);
            
    /**
     * <p>id(0x60030005)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "LoginTimeout", dispId = 0x60030005)
    Short getLoginTimeout();
            
    /**
     * <p>id(0x60030005)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "LoginTimeout", dispId = 0x60030005)
    void setLoginTimeout(Short param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Workspaces", dispId = 0x0)
    Workspaces getWorkspaces();
            
    /**
     * <p>id(0x60030008)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Errors", dispId = 0x60030008)
    Errors getErrors();
            
    /**
     * <p>id(0x60030009)</p>
     * <p>vtableId(17)</p>
     * @param Action [in, optional] {@code Object}
     */
    @ComMethod(name = "Idle", dispId = 0x60030009)
    void Idle(Object Action);
            
    /**
     * <p>id(0x6003000a)</p>
     * <p>vtableId(18)</p>
     * @param SrcName [in] {@code String}
     * @param DstName [in] {@code String}
     * @param DstLocale [in, optional] {@code Object}
     * @param Options [in, optional] {@code Object}
     * @param SrcLocale [in, optional] {@code Object}
     */
    @ComMethod(name = "CompactDatabase", dispId = 0x6003000a)
    void CompactDatabase(String SrcName,
            String DstName,
            Object DstLocale,
            Object Options,
            Object SrcLocale);
            
    /**
     * <p>id(0x6003000b)</p>
     * <p>vtableId(19)</p>
     * @param Name [in] {@code String}
     */
    @ComMethod(name = "RepairDatabase", dispId = 0x6003000b)
    void RepairDatabase(String Name);
            
    /**
     * <p>id(0x6003000c)</p>
     * <p>vtableId(20)</p>
     * @param Dsn [in] {@code String}
     * @param Driver [in] {@code String}
     * @param Silent [in] {@code Boolean}
     * @param Attributes [in] {@code String}
     */
    @ComMethod(name = "RegisterDatabase", dispId = 0x6003000c)
    void RegisterDatabase(String Dsn,
            String Driver,
            Boolean Silent,
            String Attributes);
            
    /**
     * <p>id(0x6003000d)</p>
     * <p>vtableId(21)</p>
     * @param Name [in] {@code String}
     * @param UserName [in] {@code String}
     * @param Password [in] {@code String}
     */
    @ComMethod(name = "_30_CreateWorkspace", dispId = 0x6003000d)
    Workspace _30_CreateWorkspace(String Name,
            String UserName,
            String Password);
            
    /**
     * <p>id(0x6003000e)</p>
     * <p>vtableId(22)</p>
     * @param Name [in] {@code String}
     * @param Options [in, optional] {@code Object}
     * @param ReadOnly [in, optional] {@code Object}
     * @param Connect [in, optional] {@code Object}
     */
    @ComMethod(name = "OpenDatabase", dispId = 0x6003000e)
    Database OpenDatabase(String Name,
            Object Options,
            Object ReadOnly,
            Object Connect);
            
    /**
     * <p>id(0x6003000f)</p>
     * <p>vtableId(23)</p>
     * @param Name [in] {@code String}
     * @param Locale [in] {@code String}
     * @param Option [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateDatabase", dispId = 0x6003000f)
    Database CreateDatabase(String Name,
            String Locale,
            Object Option);
            
    /**
     * <p>id(0x60030010)</p>
     * <p>vtableId(24)</p>
     */
    @ComMethod(name = "FreeLocks", dispId = 0x60030010)
    void FreeLocks();
            
    /**
     * <p>id(0x60030011)</p>
     * <p>vtableId(25)</p>
     */
    @ComMethod(name = "BeginTrans", dispId = 0x60030011)
    void BeginTrans();
            
    /**
     * <p>id(0x60030012)</p>
     * <p>vtableId(26)</p>
     * @param Option [in, optional] {@code Integer}
     */
    @ComMethod(name = "CommitTrans", dispId = 0x60030012)
    void CommitTrans(Integer Option);
            
    /**
     * <p>id(0x60030013)</p>
     * <p>vtableId(27)</p>
     */
    @ComMethod(name = "Rollback", dispId = 0x60030013)
    void Rollback();
            
    /**
     * <p>id(0x60030014)</p>
     * <p>vtableId(28)</p>
     * @param Name [in] {@code String}
     * @param Password [in] {@code String}
     */
    @ComMethod(name = "SetDefaultWorkspace", dispId = 0x60030014)
    void SetDefaultWorkspace(String Name,
            String Password);
            
    /**
     * <p>id(0x60030015)</p>
     * <p>vtableId(29)</p>
     * @param Option [in] {@code Short}
     * @param Value [in] {@code Object}
     */
    @ComMethod(name = "SetDataAccessOption", dispId = 0x60030015)
    void SetDataAccessOption(Short Option,
            Object Value);
            
    /**
     * <p>id(0x60030016)</p>
     * <p>vtableId(30)</p>
     * @param StatNum [in] {@code Integer}
     * @param Reset [in, optional] {@code Object}
     */
    @ComMethod(name = "ISAMStats", dispId = 0x60030016)
    Integer ISAMStats(Integer StatNum,
            Object Reset);
            
    /**
     * <p>id(0x60030017)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "SystemDB", dispId = 0x60030017)
    String getSystemDB();
            
    /**
     * <p>id(0x60030017)</p>
     * <p>vtableId(32)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "SystemDB", dispId = 0x60030017)
    void setSystemDB(String param0);
            
    /**
     * <p>id(0x60030019)</p>
     * <p>vtableId(33)</p>
     * @param Name [in] {@code String}
     * @param UserName [in] {@code String}
     * @param Password [in] {@code String}
     * @param UseType [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateWorkspace", dispId = 0x60030019)
    Workspace CreateWorkspace(String Name,
            String UserName,
            String Password,
            Object UseType);
            
    /**
     * <p>id(0x6003001a)</p>
     * <p>vtableId(34)</p>
     * @param Name [in] {@code String}
     * @param Options [in, optional] {@code Object}
     * @param ReadOnly [in, optional] {@code Object}
     * @param Connect [in, optional] {@code Object}
     */
    @ComMethod(name = "OpenConnection", dispId = 0x6003001a)
    Connection OpenConnection(String Name,
            Object Options,
            Object ReadOnly,
            Object Connect);
            
    /**
     * <p>id(0x6003001b)</p>
     * <p>vtableId(35)</p>
     */
    @ComProperty(name = "DefaultType", dispId = 0x6003001b)
    Integer getDefaultType();
            
    /**
     * <p>id(0x6003001b)</p>
     * <p>vtableId(36)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DefaultType", dispId = 0x6003001b)
    void setDefaultType(Integer param0);
            
    /**
     * <p>id(0x6003001d)</p>
     * <p>vtableId(37)</p>
     * @param Option [in] {@code Integer}
     * @param Value [in] {@code Object}
     */
    @ComMethod(name = "SetOption", dispId = 0x6003001d)
    void SetOption(Integer Option,
            Object Value);
            
    
}