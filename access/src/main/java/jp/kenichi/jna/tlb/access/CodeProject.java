
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({9212BA72-3E79-11D1-98BD-006008197D41})</p>
 * <p>interface(_CurrentProject)</p>
 */
@ComObject(clsId = "{9212BA72-3E79-11D1-98BD-006008197D41}")
public interface CodeProject extends IUnknown
    ,_CurrentProject
{

}