package kz.zvezdochet.sweph.preferences;

import kz.zvezdochet.sweph.Activator;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * Визуальное представление для доступа к редактируемым параметрам эфемерид
 * (Помощь - Настройки - Эфемериды)
 * @author Nataly Didenko
 */

public class SwephPreferencePage extends FieldEditorPreferencePage
						implements IWorkbenchPreferencePage {

	public SwephPreferencePage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Эфемериды");
		getPreferenceStore().needsSaving();
	}
	
	/**
	 * Создание редактируемых полей
	 */
	public void createFieldEditors() {
		DirectoryFieldEditor pathEditor = new DirectoryFieldEditor(
				PreferenceConstants.SE_EPHE_PATH,
				"Директория эфемерид",
				getFieldEditorParent());
			addField(pathEditor);
			pathEditor.setEnabled(true, getFieldEditorParent());
			pathEditor.setEmptyStringAllowed(false);
			pathEditor.setChangeButtonText("Выбрать");
	}

	public void init(IWorkbench workbench) {}
}