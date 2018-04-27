
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({08F6C822-3CFD-11D1-98BC-006008197D41})</p>
 * <p>interface(AllObjects)</p>
 */
@ComObject(clsId = "{08F6C822-3CFD-11D1-98BC-006008197D41}")
public interface AllFunctions extends IUnknown
    ,AllObjects
{

}