
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000039-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000039-0000-0010-8000-00AA006D2EA4}")
public interface Workspace extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Name", dispId = 0x60030000)
    String getName();
            
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x60030000)
    void setName(String param0);
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "UserName", dispId = 0x60030002)
    String getUserName();
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "_30_UserName", dispId = 0x60030003)
    void set_30_UserName(String param0);
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "_30_Password", dispId = 0x60030004)
    void set_30_Password(String param0);
            
    /**
     * <p>id(0x60030005)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "IsolateODBCTrans", dispId = 0x60030005)
    Short getIsolateODBCTrans();
            
    /**
     * <p>id(0x60030005)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "IsolateODBCTrans", dispId = 0x60030005)
    void setIsolateODBCTrans(Short param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Databases", dispId = 0x0)
    Databases getDatabases();
            
    /**
     * <p>id(0x60030008)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Users", dispId = 0x60030008)
    Users getUsers();
            
    /**
     * <p>id(0x60030009)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Groups", dispId = 0x60030009)
    Groups getGroups();
            
    /**
     * <p>id(0x6003000a)</p>
     * <p>vtableId(18)</p>
     */
    @ComMethod(name = "BeginTrans", dispId = 0x6003000a)
    void BeginTrans();
            
    /**
     * <p>id(0x6003000b)</p>
     * <p>vtableId(19)</p>
     * @param Options [in, optional] {@code Integer}
     */
    @ComMethod(name = "CommitTrans", dispId = 0x6003000b)
    void CommitTrans(Integer Options);
            
    /**
     * <p>id(0x6003000c)</p>
     * <p>vtableId(20)</p>
     */
    @ComMethod(name = "Close", dispId = 0x6003000c)
    void Close();
            
    /**
     * <p>id(0x6003000d)</p>
     * <p>vtableId(21)</p>
     */
    @ComMethod(name = "Rollback", dispId = 0x6003000d)
    void Rollback();
            
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
     * @param Connect [in] {@code String}
     * @param Option [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateDatabase", dispId = 0x6003000f)
    Database CreateDatabase(String Name,
            String Connect,
            Object Option);
            
    /**
     * <p>id(0x60030010)</p>
     * <p>vtableId(24)</p>
     * @param Name [in, optional] {@code Object}
     * @param PID [in, optional] {@code Object}
     * @param Password [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateUser", dispId = 0x60030010)
    User CreateUser(Object Name,
            Object PID,
            Object Password);
            
    /**
     * <p>id(0x60030011)</p>
     * <p>vtableId(25)</p>
     * @param Name [in, optional] {@code Object}
     * @param PID [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateGroup", dispId = 0x60030011)
    Group CreateGroup(Object Name,
            Object PID);
            
    /**
     * <p>id(0x60030012)</p>
     * <p>vtableId(26)</p>
     * @param Name [in] {@code String}
     * @param Options [in, optional] {@code Object}
     * @param ReadOnly [in, optional] {@code Object}
     * @param Connect [in, optional] {@code Object}
     */
    @ComMethod(name = "OpenConnection", dispId = 0x60030012)
    Connection OpenConnection(String Name,
            Object Options,
            Object ReadOnly,
            Object Connect);
            
    /**
     * <p>id(0x60030013)</p>
     * <p>vtableId(27)</p>
     */
    @ComProperty(name = "LoginTimeout", dispId = 0x60030013)
    Integer getLoginTimeout();
            
    /**
     * <p>id(0x60030013)</p>
     * <p>vtableId(28)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "LoginTimeout", dispId = 0x60030013)
    void setLoginTimeout(Integer param0);
            
    /**
     * <p>id(0x60030015)</p>
     * <p>vtableId(29)</p>
     */
    @ComProperty(name = "DefaultCursorDriver", dispId = 0x60030015)
    Integer getDefaultCursorDriver();
            
    /**
     * <p>id(0x60030015)</p>
     * <p>vtableId(30)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "DefaultCursorDriver", dispId = 0x60030015)
    void setDefaultCursorDriver(Integer param0);
            
    /**
     * <p>id(0x60030017)</p>
     * <p>vtableId(31)</p>
     */
    @ComProperty(name = "hEnv", dispId = 0x60030017)
    Integer getHEnv();
            
    /**
     * <p>id(0x60030018)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "Type", dispId = 0x60030018)
    Integer getType();
            
    /**
     * <p>id(0x60030019)</p>
     * <p>vtableId(33)</p>
     */
    @ComProperty(name = "Connections", dispId = 0x60030019)
    Connections getConnections();
            
    
}