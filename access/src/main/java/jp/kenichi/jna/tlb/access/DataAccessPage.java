
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({493D8A73-1DB1-11D1-98A2-006008197D41})</p>
 * <p>interface(_DataAccessPage)</p>
 */
@ComObject(clsId = "{493D8A73-1DB1-11D1-98A2-006008197D41}")
public interface DataAccessPage extends IUnknown
    ,_DataAccessPage
{

}