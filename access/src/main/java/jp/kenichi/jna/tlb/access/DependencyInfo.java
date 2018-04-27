
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({F8C9DCB3-4063-490E-A73C-3533207CBC26})</p>
 * <p>interface(_DependencyInfo)</p>
 */
@ComObject(clsId = "{F8C9DCB3-4063-490E-A73C-3533207CBC26}")
public interface DependencyInfo extends IUnknown
    ,_DependencyInfo
{

}