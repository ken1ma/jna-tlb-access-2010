
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({E27A992D-A330-11D0-81DD-00C04FC2F51B})</p>
 * <p>interface(_FormatCondition)</p>
 */
@ComObject(clsId = "{E27A992D-A330-11D0-81DD-00C04FC2F51B}")
public interface FormatCondition extends IUnknown
    ,_FormatCondition
{

}