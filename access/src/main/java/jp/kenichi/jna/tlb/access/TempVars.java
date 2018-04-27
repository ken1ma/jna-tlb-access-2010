
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({6D40D9DE-2821-44A8-BAF3-8011E362CF59})</p>
 * <p>interface(_TempVars)</p>
 */
@ComObject(clsId = "{6D40D9DE-2821-44A8-BAF3-8011E362CF59}")
public interface TempVars extends IUnknown
    ,_TempVars
{

}