package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.LockOpen: ImageVector
    get() {
        if (_LockOpen != null) {
            return _LockOpen!!
        }
        _LockOpen = ImageVector.Builder(
            name = "Filled.LockOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 1.5f)
                curveToRelative(2.9f, 0f, 5.25f, 2.35f, 5.25f, 5.25f)
                verticalLineToRelative(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineTo(6.75f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -7.5f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(6.75f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineTo(3.75f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineToRelative(-6.75f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.9f, 2.35f, -5.25f, 5.25f, -5.25f)
                close()
            }
        }.build()

        return _LockOpen!!
    }

@Suppress("ObjectPropertyName")
private var _LockOpen: ImageVector? = null
