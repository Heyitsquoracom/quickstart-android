/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.firebase.quickstart.vertexai.feature.imageexplainer

/**
 * A sealed hierarchy describing the state of the text generation.
 */
sealed interface ImageUiState {

    /**
     * Empty state when the screen is first shown
     */
    data object Initial : ImageUiState

    /**
     * Still loading
     */
    data object Loading : ImageUiState

    /**
     * Text has been generated
     */
    data class Success(
        val outputText: String
    ) : ImageUiState

    /**
     * There was an error generating text
     */
    data class Error(
        val errorMessage: String
    ) : ImageUiState
}