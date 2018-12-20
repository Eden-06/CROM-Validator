/**
 * generated by Xtext 2.15.0
 */
package org.rosi.crom.validation.mapping.featureMapping.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.rosi.crom.validation.mapping.featureMapping.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureMappingFactoryImpl extends EFactoryImpl implements FeatureMappingFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FeatureMappingFactory init()
  {
    try
    {
      FeatureMappingFactory theFeatureMappingFactory = (FeatureMappingFactory)EPackage.Registry.INSTANCE.getEFactory(FeatureMappingPackage.eNS_URI);
      if (theFeatureMappingFactory != null)
      {
        return theFeatureMappingFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FeatureMappingFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMappingFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FeatureMappingPackage.MODEL: return createModel();
      case FeatureMappingPackage.UNIVERSAL: return createUniversal();
      case FeatureMappingPackage.FEATURE: return createFeature();
      case FeatureMappingPackage.INVARIANT: return createInvariant();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Universal createUniversal()
  {
    UniversalImpl universal = new UniversalImpl();
    return universal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Invariant createInvariant()
  {
    InvariantImpl invariant = new InvariantImpl();
    return invariant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureMappingPackage getFeatureMappingPackage()
  {
    return (FeatureMappingPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FeatureMappingPackage getPackage()
  {
    return FeatureMappingPackage.eINSTANCE;
  }

} //FeatureMappingFactoryImpl
