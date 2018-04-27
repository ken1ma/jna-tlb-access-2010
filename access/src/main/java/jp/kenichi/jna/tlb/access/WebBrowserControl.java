
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({D303AC37-74DB-45B9-8C22-AD7C3FBA68EF})</p>
 * <p>source(DispWebBrowserControlEvents)</p>
 * <p>interface(_WebBrowserControl)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{D303AC37-74DB-45B9-8C22-AD7C3FBA68EF}")
public interface WebBrowserControl extends IUnknown
    ,_WebBrowserControl
    ,IConnectionPoint
{

}