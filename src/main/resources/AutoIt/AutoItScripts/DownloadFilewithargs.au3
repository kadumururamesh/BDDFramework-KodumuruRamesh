#Region ;**** Directives created by AutoIt3Wrapper_GUI ****
#AutoIt3Wrapper_UseX64=y
#EndRegion ;**** Directives created by AutoIt3Wrapper_GUI ****

#include <InetConstants.au3>
#include <MsgBoxConstants.au3>
#include <WinAPIFiles.au3>

; InetGet downloads a file in the background.
; The AutoIt script checks in a loop for the download to complete.

Example()

Func Example()
        ; Save the downloaded file to the temporary folder.
        Local $sFilePath = $Cmdline[2]

        ; Download the file in the background with the selected option of 'force a reload from the remote site.'
        Local $hDownload = InetGet($Cmdline[1], $sFilePath, $INET_FORCERELOAD, $INET_DOWNLOADBACKGROUND)

EndFunc   ;==>Example