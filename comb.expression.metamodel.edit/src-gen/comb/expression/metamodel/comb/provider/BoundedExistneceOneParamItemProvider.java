/**
 */
package comb.expression.metamodel.comb.provider;

import comb.expression.metamodel.comb.BoundedExistneceOneParam;
import comb.expression.metamodel.comb.CombFactory;
import comb.expression.metamodel.comb.CombPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link comb.expression.metamodel.comb.BoundedExistneceOneParam} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BoundedExistneceOneParamItemProvider extends BoundedExistenceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedExistneceOneParamItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BoundedExistneceOneParam) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_BoundedExistneceOneParam_type")
				: getString("_UI_BoundedExistneceOneParam_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(BoundedExistneceOneParam.class)) {
		case CombPackage.BOUNDED_EXISTNECE_ONE_PARAM__Q:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createPrecedenceAfter_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createAbsenceAfter_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.create_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createUniversalityBefore_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createPrecedenceBefore_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createUniversalityAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createBoundedExistenceAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createBoundedExistenceBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createBoundedExistenceGlobally_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createAbsenceBefore_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createUniversalityBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createResponseAfter_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createPrecedenceAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createAlways_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createResponseBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createResponseAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createPrecedenceBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createExistenceBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createExistenceAfter_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createResponseBefore_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.create_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createAbsenceGlobally_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createAbsenceBetween_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.create_or_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createBoundedExistenceAfter_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createExistenceAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createUniversalityAfter_until_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createResponseGlobally_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createExistenceGlobally_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createBoundedExistenceBefore_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createEventually_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.create_implies_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createUniversalityGlobally_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createAbsenceAfter_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createExistenceBefore_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createPrecedenceGlobally_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createNext_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createNot_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createEventuallyWithin_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.create_untilWithin_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createAlwaysWithin_and_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.create_untilWithin_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createAlwaysWithin_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.createEventuallyWithin_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.create_lessThan_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.create_lessThanOrEqual_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.create_equal_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.create_greaterThan_()));

		newChildDescriptors.add(createChildParameter(CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q,
				CombFactory.eINSTANCE.create_greaterThanOrEqual_()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == CombPackage.Literals.OCCURRENCE__P
				|| childFeature == CombPackage.Literals.BOUNDED_EXISTNECE_ONE_PARAM__Q;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
