
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({1C4367A8-EAEE-4C23-9582-4A229DF2403E})</p>
 * <p>interface(_DependencyObjects)</p>
 */
@ComObject(clsId = "{1C4367A8-EAEE-4C23-9582-4A229DF2403E}")
public interface DependencyObjects extends IUnknown
    ,_DependencyObjects
{

}