package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.LockClosed: ImageVector
    get() {
        if (_LockClosed != null) {
            return _LockClosed!!
        }
        _LockClosed = ImageVector.Builder(
            name = "Outlined.LockClosed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 10.5f)
                verticalLineTo(6.75f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -9f, 0f)
                verticalLineToRelative(3.75f)
                moveToRelative(-0.75f, 11.25f)
                horizontalLineToRelative(10.5f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, -2.25f)
                verticalLineToRelative(-6.75f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, -2.25f)
                horizontalLineTo(6.75f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, 2.25f)
                verticalLineToRelative(6.75f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 2.25f)
                close()
            }
        }.build()

        return _LockClosed!!
    }

@Suppress("ObjectPropertyName")
private var _LockClosed: ImageVector? = null
