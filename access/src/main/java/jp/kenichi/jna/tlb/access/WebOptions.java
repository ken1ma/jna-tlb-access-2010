
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({416ED4F7-AB31-11D1-BF72-0060083E43CF})</p>
 * <p>interface(_WebOptions)</p>
 */
@ComObject(clsId = "{416ED4F7-AB31-11D1-BF72-0060083E43CF}")
public interface WebOptions extends IUnknown
    ,_WebOptions
{

}