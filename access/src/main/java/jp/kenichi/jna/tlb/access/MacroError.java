
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({3F1B1773-65CB-4DB9-9FC6-ACED47DB285A})</p>
 * <p>interface(_MacroError)</p>
 */
@ComObject(clsId = "{3F1B1773-65CB-4DB9-9FC6-ACED47DB285A}")
public interface MacroError extends IUnknown
    ,_MacroError
{

}