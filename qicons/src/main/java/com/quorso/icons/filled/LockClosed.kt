package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.LockClosed: ImageVector
    get() {
        if (_LockClosed != null) {
            return _LockClosed!!
        }
        _LockClosed = ImageVector.Builder(
            name = "Filled.LockClosed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 1.5f)
                arcToRelative(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.25f, 5.25f)
                verticalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(6.75f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(10.5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, -3f)
                verticalLineToRelative(-6.75f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.9f, -2.35f, -5.25f, -5.25f, -5.25f)
                close()
                moveTo(15.75f, 9.75f)
                verticalLineToRelative(-3f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -7.5f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(7.5f)
                close()
            }
        }.build()

        return _LockClosed!!
    }

@Suppress("ObjectPropertyName")
private var _LockClosed: ImageVector? = null
