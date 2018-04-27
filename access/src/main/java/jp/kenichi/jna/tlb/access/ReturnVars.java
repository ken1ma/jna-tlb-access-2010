
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({B06693E3-385D-4E70-923E-4FAB6D14EE15})</p>
 * <p>interface(_ReturnVars)</p>
 */
@ComObject(clsId = "{B06693E3-385D-4E70-923E-4FAB6D14EE15}")
public interface ReturnVars extends IUnknown
    ,_ReturnVars
{

}