package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.DocumentDuplicate: ImageVector
    get() {
        if (_DocumentDuplicate != null) {
            return _DocumentDuplicate!!
        }
        _DocumentDuplicate = ImageVector.Builder(
            name = "Filled.DocumentDuplicate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 3.375f)
                curveToRelative(0f, -1.036f, 0.84f, -1.875f, 1.875f, -1.875f)
                horizontalLineToRelative(0.375f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.75f, 3.75f)
                verticalLineToRelative(1.875f)
                curveTo(13.5f, 8.161f, 14.34f, 9f, 15.375f, 9f)
                horizontalLineToRelative(1.875f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12.75f)
                verticalLineToRelative(3.375f)
                curveTo(21f, 17.16f, 20.16f, 18f, 19.125f, 18f)
                horizontalLineToRelative(-9.75f)
                arcTo(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 16.125f)
                verticalLineTo(3.375f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 5.25f)
                arcToRelative(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.279f, -3.434f)
                arcToRelative(9.768f, 9.768f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.963f, 6.963f)
                arcTo(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.25f, 7.5f)
                horizontalLineToRelative(-1.875f)
                arcTo(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 7.125f)
                verticalLineTo(5.25f)
                close()
                moveTo(4.875f, 6f)
                horizontalLineTo(6f)
                verticalLineToRelative(10.125f)
                arcTo(3.375f, 3.375f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.375f, 19.5f)
                horizontalLineTo(16.5f)
                verticalLineToRelative(1.125f)
                curveToRelative(0f, 1.035f, -0.84f, 1.875f, -1.875f, 1.875f)
                horizontalLineToRelative(-9.75f)
                arcTo(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 20.625f)
                verticalLineTo(7.875f)
                curveTo(3f, 6.839f, 3.84f, 6f, 4.875f, 6f)
                close()
            }
        }.build()

        return _DocumentDuplicate!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentDuplicate: ImageVector? = null
