package com.gvelesiani.passworx.diModules

import com.gvelesiani.passworx.domain.useCases.*
import org.koin.dsl.module

val useCasesModule = module {
    factory {
        GeneratePasswordUseCase(get())
    }

    factory {
        AddNewPasswordUseCase(get())
    }

    factory {
        GetPasswordsUseCase(get())
    }

    factory {
        UpdateFavoriteStateUseCase(get())
    }

    factory {
        UpdateItemTrashStateUseCase(get())
    }

    factory {
        DeletePasswordUseCase(get())
    }

    factory {
        SearchPasswordsUseCase(get())
    }

    factory {
        CreateOrChangeMasterPasswordUseCase(get())
    }

    factory {
        GetMasterPasswordUseCase(get())
    }

    factory {
        DecryptPasswordUseCase(get())
    }

    factory {
        GetFavoritePasswordsUseCase(get())
    }

    factory {
        GetTakingScreenshotsStatusUseCase(get())
    }

    factory {
        PreventTakingScreenshotsUseCase(get())
    }

    factory {
        GetBiometricsAllowingStatusUserCase(get())
    }

    factory {
        AllowBiometricsUseCase(get())
    }

    factory {
        FinishIntroUseCase(get())
    }

    factory {
        CheckIfIntroIsFinishedUseCase(get())
    }
}