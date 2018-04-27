
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({805B7F91-C9CF-4EDF-ACA6-775664FDFB3E})</p>
 * <p>interface(_User)</p>
 */
@ComObject(clsId = "{805B7F91-C9CF-4EDF-ACA6-775664FDFB3E}")
public interface User extends IUnknown
    ,_User
{

}