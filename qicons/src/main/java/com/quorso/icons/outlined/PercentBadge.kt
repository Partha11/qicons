package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.PercentBadge: ImageVector
    get() {
        if (_PercentBadge != null) {
            return _PercentBadge!!
        }
        _PercentBadge = ImageVector.Builder(
            name = "Outlined.PercentBadge",
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
                moveToRelative(8.99f, 14.993f)
                lineToRelative(6f, -6f)
                moveToRelative(6f, 3.001f)
                curveToRelative(0f, 1.268f, -0.63f, 2.39f, -1.593f, 3.069f)
                arcToRelative(3.746f, 3.746f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.043f, 3.296f)
                arcToRelative(3.745f, 3.745f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.296f, 1.043f)
                arcToRelative(3.745f, 3.745f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.068f, 1.593f)
                curveToRelative(-1.268f, 0f, -2.39f, -0.63f, -3.068f, -1.593f)
                arcToRelative(3.745f, 3.745f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.296f, -1.043f)
                arcToRelative(3.746f, 3.746f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.043f, -3.297f)
                arcToRelative(3.746f, 3.746f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.593f, -3.068f)
                curveToRelative(0f, -1.268f, 0.63f, -2.39f, 1.593f, -3.068f)
                arcToRelative(3.746f, 3.746f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.043f, -3.297f)
                arcToRelative(3.745f, 3.745f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.296f, -1.042f)
                arcToRelative(3.745f, 3.745f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.068f, -1.594f)
                curveToRelative(1.268f, 0f, 2.39f, 0.63f, 3.068f, 1.593f)
                arcToRelative(3.745f, 3.745f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.296f, 1.043f)
                arcToRelative(3.746f, 3.746f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.043f, 3.297f)
                arcToRelative(3.746f, 3.746f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.593f, 3.068f)
                close()
                moveTo(9.74f, 9.743f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.007f)
                lineTo(9.74f, 9.75f)
                verticalLineToRelative(-0.007f)
                close()
                moveTo(10.115f, 9.743f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0f)
                close()
                moveTo(14.24f, 14.243f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(-0.008f)
                verticalLineToRelative(-0.008f)
                close()
                moveTo(14.615f, 14.243f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.75f, 0f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0f)
                close()
            }
        }.build()

        return _PercentBadge!!
    }

@Suppress("ObjectPropertyName")
private var _PercentBadge: ImageVector? = null
