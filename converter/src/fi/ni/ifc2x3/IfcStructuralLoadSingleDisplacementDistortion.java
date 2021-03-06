package fi.ni.ifc2x3;
import fi.ni.ifc2x3.interfaces.*;
import fi.ni.*;
import java.util.*;

/*
 * IFC Java class
 * @author Jyrki Oraskari
 * @license This work is licensed under a Creative Commons Attribution 3.0 Unported License.
 * http://creativecommons.org/licenses/by/3.0/ 
 */

public class IfcStructuralLoadSingleDisplacementDistortion extends IfcStructuralLoadSingleDisplacement 
{
 // The property attributes
 Double distortion;


 // Getters and setters of properties

 public Double getDistortion() {
   return distortion;
 }
 public void setDistortion(String txt){
   Double value = i.toDouble(txt);
   this.distortion=value;

 }

}
