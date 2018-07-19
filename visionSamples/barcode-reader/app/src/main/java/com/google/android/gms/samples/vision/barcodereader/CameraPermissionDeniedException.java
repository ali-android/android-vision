package com.google.android.gms.samples.vision.barcodereader;

/**
 * In some Android phones, OEM have customised OS, and request for permission in OS below Marshmallow.
 * This exception is thrown if after bypassing permission check, a RuntimeException is received.
 * */
public class CameraPermissionDeniedException extends SecurityException {
    public CameraPermissionDeniedException(){
        super();
    }
    public CameraPermissionDeniedException(String message){
        super(message);
    }
}
