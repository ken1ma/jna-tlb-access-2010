
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({9CD4A762-A6A9-11CE-A686-00AA003F0F07})</p>
 * <p>source(DispPaletteButtonEvents)</p>
 * <p>source(_PaletteButtonEvents)</p>
 * <p>interface(_PaletteButton)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{9CD4A762-A6A9-11CE-A686-00AA003F0F07}")
public interface PaletteButton extends IUnknown
    ,_PaletteButton
    ,IConnectionPoint
{

}