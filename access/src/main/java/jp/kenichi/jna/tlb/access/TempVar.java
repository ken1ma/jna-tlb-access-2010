
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({12DCE806-EA8A-46AA-88DF-C4486EDB78E3})</p>
 * <p>interface(_TempVar)</p>
 */
@ComObject(clsId = "{12DCE806-EA8A-46AA-88DF-C4486EDB78E3}")
public interface TempVar extends IUnknown
    ,_TempVar
{

}