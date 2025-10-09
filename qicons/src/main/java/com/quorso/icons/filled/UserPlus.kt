package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.UserPlus: ImageVector
    get() {
        if (_UserPlus != null) {
            return _UserPlus!!
        }
        _UserPlus = ImageVector.Builder(
            name = "Filled.UserPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.25f, 6.375f)
                arcToRelative(4.125f, 4.125f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.25f, 0f)
                arcToRelative(4.125f, 4.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.25f, 0f)
                close()
                moveTo(2.25f, 19.125f)
                arcToRelative(7.125f, 7.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.25f, 0f)
                verticalLineToRelative(0.003f)
                lineToRelative(-0.001f, 0.119f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.363f, 0.63f)
                arcToRelative(13.067f, 13.067f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.761f, 1.873f)
                curveToRelative(-2.472f, 0f, -4.786f, -0.684f, -6.76f, -1.873f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.364f, -0.63f)
                lineToRelative(-0.001f, -0.122f)
                close()
                moveTo(18.75f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(2.25f)
                horizontalLineTo(15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-2.25f)
                horizontalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-2.25f)
                verticalLineTo(7.5f)
                close()
            }
        }.build()

        return _UserPlus!!
    }

@Suppress("ObjectPropertyName")
private var _UserPlus: ImageVector? = null
